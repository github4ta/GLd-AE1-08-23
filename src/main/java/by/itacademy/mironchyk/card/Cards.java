package by.itacademy.mironchyk.card;

import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cards {

    private static final String[] NAMES = {"John Doe", "Jane Smith", "Alice Johnson", "Robert Brown"};
    private static final Random RANDOM = new Random();

    public static Card generateRandomCard() {
        String number = generateRandomNumber();
        String expiredDate = generateExpiredDate();
        String holder = generateRandomHolder();
        return new Card(number, expiredDate, holder);
    }

    private static String generateRandomNumber() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(RANDOM.nextInt(10));
        }
        return sb.toString();
    }

    private static String generateExpiredDate() {
        LocalDate now = LocalDate.now();
        int month = now.getMonthValue();
        int year = now.getYear() % 100;

        month += RANDOM.nextInt(12 - month + 1) + 1;
        if (month > 12) {
            month -= 12;
            year++;
        }

        return String.format("%02d/%02d", month, year);
    }

    private static String generateRandomHolder() {
        return NAMES[RANDOM.nextInt(NAMES.length)];
    }

    public static boolean isValid(Card card) {
        String expiredDate = card.getExpiredDate();
        if (!expiredDate.matches("\\d{2}/\\d{2}")) {
            return false;
        }

        int month = Integer.parseInt(expiredDate.substring(0, 2));
        int year = Integer.parseInt(expiredDate.substring(3, 5));

        LocalDate now = LocalDate.now();
        int currentMonth = now.getMonthValue();
        int currentYear = now.getYear() % 100;

        return (year > currentYear) || (year == currentYear && month >= currentMonth);
    }
}
