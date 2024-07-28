package by.itacademy.pavelyatsevich.card;

import net.datafaker.Faker;

import java.time.LocalDate;
import java.util.Random;

public class Cards {

    private static final Faker FAKER = new Faker();
    private static final String[] MONTH = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    private static final String[] YEARS = {"24", "25", "26"};
    private static final String MONTH_ADN_YEAR_REGEX = "[0-1][0-9]/[0-9][0-9]";

    public static Card generateRandomCard() {
        String cardNumber = generateRandomCardNumber();
        String expiredDate = generateRandomExpiredDate();
        String holder = generateRandomHolder();
        return new Card(cardNumber, expiredDate, holder);
    }

    public static boolean isValid(Card card) throws NumberFormatException {
        if (card.getExpiredDate().matches(MONTH_ADN_YEAR_REGEX)) {
            String[] cardMonthAndYear = getCardMonthAndYear(card);
            int cardMonth = Integer.parseInt(cardMonthAndYear[0]);
            int cardYear = Integer.parseInt(cardMonthAndYear[1]);
            int currentMonthValue = getCurrentMonthValue();
            int currentYearValue = getCurrentYearValue();
            if (cardYear > currentYearValue && cardMonth > 0 && cardMonth <=12){
                return true;
            }
            return cardYear == currentYearValue && cardMonth >= currentMonthValue && cardMonth <= 12;
        }
        return false;
    }

    private static String[] getCardMonthAndYear(Card card) {
        return card.getExpiredDate().split("/");
    }

    private static String generateRandomCardNumber() {
        return FAKER.business().creditCardNumber().replaceAll("-"," ");
    }

    private static String generateRandomExpiredDate() {
        return generateRandomMonth() + "/" + generateRandomYear();
    }

    private static String generateRandomHolder() {
        return FAKER.name().firstName().toUpperCase() + " " + FAKER.name().lastName().toUpperCase();
    }

    private static String generateRandomMonth() {
        return getMonthWithVerification();
    }

    private static String generateRandomYear() {
        return YEARS[getRandomArrayPosition(YEARS)];
    }

    private static String getMonthWithVerification() throws NumberFormatException {
        String month = MONTH[getRandomArrayPosition(MONTH)];
        int currentMonthValue = getCurrentMonthValue();
        while (Integer.parseInt(month) <= currentMonthValue) {
            month = generateRandomMonth();
        }
        return month;
    }

    private static int getRandomArrayPosition(String[] arr) {
        return new Random().nextInt(arr.length);
    }

    private static int getCurrentMonthValue() {
        return LocalDate.now().getMonthValue();
    }

    private static int getCurrentYearValue() throws NumberFormatException {
        String currentYear = String.valueOf(LocalDate.now().getYear());
        currentYear = currentYear.substring(2);
        return Integer.parseInt(currentYear);
    }
}
