package by.itacademy.aksanabazhenava.card;

import java.time.LocalDate;
import java.util.Random;

public class Cards {

    public static Card generateRandomCard() {
        String cardNumber = generateRandomNumberCard();
        String expiredDate = String.valueOf(generateRandomExpiredDateCard());
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
    public static LocalDate generateRandomExpiredDateCard(){
        Random random = new Random();
        int year = LocalDate.now().getYear() - random.nextInt(10);

        int month = random.nextInt(12) + 1;
        int day = random.nextInt(28) + 1;
        return LocalDate.of(year, month, day);
    }
    public static String generateRandomHolderCard() {
        String[] firstNames = {"Ivan", "Alla", "Micha", "Eva", "Daniil"};
        String[] lastNames = {"Ivanenko", "Butenko", "Grigorenko", "Lee", "Smitt"};
        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        return firstName + " " + lastName;
    }

    public static boolean isValid(Card card) {

        return false;
    }
}
