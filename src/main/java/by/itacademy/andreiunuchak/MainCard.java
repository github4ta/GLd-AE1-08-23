package by.itacademy.andreiunuchak;

import by.itacademy.andreiunuchak.card.Card;
import by.itacademy.andreiunuchak.card.Cards;

public class MainCard {
    public static void main(String[] args) {
        Card card1 = Cards.generateRandomCard();
        print(card1);

        Card card2 = new Card("1234567890123456", "07/24", "Andrei Unuchak");
        print(card2);

        Card card3 = Cards.generateRandomCard();
        card3.setExpiredDate("12/23");
        print(card3);
        card3.setExpiredDate("01/24");
        print(card3);
        card3.setExpiredDate("08/24");
        print(card3);
        card3.setExpiredDate("01/25");
        print(card3);

        try {
            Card card4 = new Card("1324", "10/24", "Mr.Error"); // throws IllegalArgumentException
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            Card card4 = new Card("1324567890123456", "10/2024", "Mr.Error"); // throws IllegalArgumentException
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            Card card4 = new Card("1324567890123456", "10/24", ""); // throws IllegalArgumentException
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            Card card4 = new Card(null, null, null); // throws NullPointerException
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void print(Card card) {
        System.out.println(card + "   is valid: " + Cards.isValid(card));
    }
}
