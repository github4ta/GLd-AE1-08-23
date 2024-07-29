package by.itacademy.andreiunuchak.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    public void validateGetMethods(){
        String number = "1472583690123654";
        String expDate = "12/25";
        String holder = "ANDREI UNUCHAK";
        Card card = new Card(number, expDate, holder);
        Assertions.assertEquals(number, card.getNumber());
        Assertions.assertEquals(expDate, card.getExpiredDate());
        Assertions.assertEquals(holder, card.getHolder());

    }
}
