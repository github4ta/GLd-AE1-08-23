package by.itacademy.aksanabazhenava.card;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Cards {

    public static Card generateRandomCard() {
        String cardNumber = generateRandomNumberCard();
        String expiredDate = generateRandomExpiredDateCard();
        String holder = generateRandomHolderCard();
        return new Card(cardNumber, expiredDate, holder);
    }

    public static String generateRandomNumberCard() {
        StringBuilder number = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            int numeral = random.nextInt(10);
            number.append(numeral);
        }
        return number.toString();
    }

    public static String generateRandomExpiredDateCard() {
        Random random = new Random();
        String[] years = {"24", "25", "26"};
        int indexYears = new Random().nextInt(years.length);
        String year = years[indexYears];
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(28) + 1;
        LocalDate currentMonth = LocalDate.now();
        int currMonth = currentMonth.getMonthValue();
        while (month <= currMonth) {
            month = random.nextInt(12) + 1;
        }
        return LocalDate.of(Integer.parseInt(year), month, day).format(DateTimeFormatter.ofPattern("yy/MM"));
    }

    public static String generateRandomHolderCard() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        return firstName + " " + lastName;
    }

    public static boolean isValid(Card card) {

        return false;
    }
}
