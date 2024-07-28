package by.itacademy.pavelyatsevich;

import by.itacademy.pavelyatsevich.card.Card;
import by.itacademy.pavelyatsevich.card.Cards;

import java.util.ArrayList;

public class MainCard {
    public static void main(String[] args) {
        System.out.println("Creating 5 random cards:");
        System.out.println();

        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cards.add(Cards.generateRandomCard());
        }

        for (Card card : cards) {
            System.out.println(card);
            System.out.println("Card is valid - " + Cards.isValid(card));
        }

        System.out.println();
        System.out.println("Changing cards expiredDate");
        System.out.println();

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            card.setExpiredDate("1" + i + "/" + "2" + i);
            System.out.println(card);
            System.out.println("Card is valid - " + Cards.isValid(card));
        }
    }
}
