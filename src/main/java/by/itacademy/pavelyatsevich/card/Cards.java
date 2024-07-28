package by.itacademy.pavelyatsevich.card;

import net.datafaker.Faker;

import java.time.LocalDate;
import java.util.Random;

public class Cards {

    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();
    private static final int STARTING_MONTH_INCLUSIVE = 1;
    private static final int END_MONTH_EXCLUSIVELY = 13;
    private static final int STARTING_YEAR_INCLUSIVE = 24;
    private static final int END_YEAR_EXCLUSIVELY = 27;
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
            if (cardYear > currentYearValue && cardMonth > 0 && cardMonth <= 12) {
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
        String generatedCardNumber = FAKER.business().creditCardNumber().replaceAll("-", " ");
        while (generatedCardNumber.length() != 19) {
            generatedCardNumber = FAKER.business().creditCardNumber().replaceAll("-", " ");
        }
        return generatedCardNumber;
    }

    private static String generateRandomExpiredDate() {
        int generatedYear = generateRandomYear();
        int[] generatedMonthAndYearArray = generateRandomMonth(generatedYear);
        if (generatedMonthAndYearArray[0] < 10) {
            return "0" + generatedMonthAndYearArray[0] + "/" + generatedMonthAndYearArray[1];
        }
        return generatedMonthAndYearArray[0] + "/" + generatedMonthAndYearArray[1];
    }

    private static String generateRandomHolder() {
        return FAKER.name().firstName().toUpperCase() + " " + FAKER.name().lastName().toUpperCase();
    }

    private static int[] generateRandomMonth(int randomYear) {
        return getMonthWithVerification(randomYear);
    }

    private static int generateRandomYear() {
        return getRandomNumberUsingInts(STARTING_YEAR_INCLUSIVE, END_YEAR_EXCLUSIVELY);
    }

    private static int[] getMonthWithVerification(int generatedYear) throws NumberFormatException {
        int month = getRandomNumberUsingInts(STARTING_MONTH_INCLUSIVE, END_MONTH_EXCLUSIVELY);
        int currentMonthValue = getCurrentMonthValue();
        int currentYearValue = getCurrentYearValue();

        if (generatedYear > currentYearValue) {
            return new int[]{month, generatedYear};
        }

        if (generatedYear == currentYearValue && currentMonthValue == 12) {
            generatedYear += 1;
            return new int[]{month, generatedYear};
        }

        if (generatedYear == currentYearValue && currentMonthValue < 12) {
            while (month <= currentMonthValue) {
                month = getRandomNumberUsingInts(1, 12);
            }
            return new int[]{month, generatedYear};
        }
        return new int[]{0, 0};
    }

    private static int getRandomNumberUsingInts(int min, int max) {
        return RANDOM.ints(min, max)
                .findFirst()
                .getAsInt();
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
