package by.itacademy.sergeymelnik.card;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Cards {

    public static Card getRandomCard() {
        Faker faker = new Faker(Locale.ENGLISH);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");   // format by default no need to check
        Card card = new Card("BY" + faker.number().digits(12), sdf.format(faker.date().future(720, 31, TimeUnit.DAYS)),
                faker.name().firstName().toUpperCase() + "." + faker.name().lastName().toUpperCase());
        return card;
    }

    public static boolean isValid(Card card) {
        boolean isValid = false;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
        String dateNow = sdf.format(date);
        if (Integer.parseInt(card.getExpiredDate().substring(0, 2)) >= 1 && Integer.parseInt(card.getExpiredDate().substring(0, 2)) <= 12 &&
                Integer.parseInt(card.getExpiredDate().substring(3, 5)) >= 24 && Integer.parseInt(card.getExpiredDate().substring(3, 5)) <= 26 &&
                Integer.parseInt(dateNow.substring(3, 5)) <= Integer.parseInt(card.getExpiredDate().substring(3, 5))
        ) {
            if (Integer.parseInt(dateNow.substring(3, 5)) == Integer.parseInt(card.getExpiredDate().substring(3, 5)) &&
                    Integer.parseInt(dateNow.substring(0, 2)) <= Integer.parseInt(card.getExpiredDate().substring(0, 2))
            ) {
                isValid = true;
            }
        else if (Integer.parseInt(dateNow.substring(3, 5)) < Integer.parseInt(card.getExpiredDate().substring(3, 5))) {
            isValid = true;
        }
        }
        return isValid;
    }

}
