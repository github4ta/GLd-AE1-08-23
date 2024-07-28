package by.itacademy.aksanabazhenava.card;

import java.time.LocalDate;
import java.util.Random;

public class Cards {

    public static Card generateRandomCard() {
        String cardNumber = generateRandomNumberCard();
        String expiredDate = generateRandomExpiredDateCard();
        String holder = String.valueOf(generateRandomHolderCard());
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
    public static LocalDate generateRandomHolderCard(){
        Random random = new Random();
        int year = LocalDate.now().getYear() - random.nextInt(10);
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(28) + 1; // Просто для примера, не учитывает месяц
        return LocalDate.of(year, month, day);
    }
    public static String generateRandomExpiredDateCard() {
        String[] firstNames = {"John", "Alice", "Michael", "Emma", "David"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Lee", "Davis"};
        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        return firstName + " " + lastName;
    }

    public static boolean isValid(Card card) {

        return false;
    }
}
