package by.itacademy.card;

import com.github.javafaker.Faker;

import java.util.Calendar;
import java.util.Random;

public class Cards {
    public static Card generateRandomCard() {
        String number = "";
        for (int i = 0; i < 16; i++) {
            number += String.valueOf(new Random().nextInt(10));
        }
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int generatedMonth = currentMonth + 1;
        generatedMonth = (generatedMonth > 12) ? (generatedMonth % 12) : generatedMonth;
        String monthStr = (generatedMonth < 10 ? "0" : "") + generatedMonth;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int minYear = generatedMonth < currentMonth ? currentYear + 1 : currentYear;
        int generatedYear = new Random().nextInt(minYear, minYear + 10);
        String yearStr = String.valueOf(generatedYear % 100);
        String expiredDate = monthStr + "/" + yearStr;
        String holder = new Faker().name().firstName() + " " + new Faker().name().lastName();
        return new Card(number, expiredDate, holder);
    }

    public static boolean isValid(Card card) {
        if (card.getExpiredDate().matches("[0-1][0-9]+/[0-9][0-9]")) {
            int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int currentYear = Calendar.getInstance().get(Calendar.YEAR) % 100;
            int cardMonth = Integer.parseInt(card.getExpiredDate().split("/")[0]);
            int cardYear = Integer.parseInt(card.getExpiredDate().split("/")[1]);
            if (cardYear > currentYear) {
                return true;
            } else if (cardYear == currentYear && cardMonth > currentMonth) {
                return true;
            }
        }
        return false;
    }
}
