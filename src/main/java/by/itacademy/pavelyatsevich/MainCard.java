package by.itacademy.pavelyatsevich;

import by.itacademy.pavelyatsevich.card.Card;
import by.itacademy.pavelyatsevich.card.Cards;

import java.util.ArrayList;

public class MainCard {
    public static void main(String[] args) {
        System.out.println("Creating 12 random cards:");
        System.out.println();

        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            cards.add(Cards.generateRandomCard());
        }

        for (Card card : cards) {
            System.out.println(card);
            System.out.println("Card is valid - " + Cards.isValid(card));
        }

        System.out.println();
        System.out.println("Changing cards expiredDate");
        System.out.println();
        int k = 0;
        int y = 20;
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            if (k < 10) {
                card.setExpiredDate("0" + k + "/" + y);
            }
            if (k >= 10) {
                card.setExpiredDate(k + "/" + y);
            }
            if (k == 12) {
                k = 0;
            }
            k++;
            y++;
            System.out.println(card);
            System.out.println("Card is valid - " + Cards.isValid(card));
        }
    }
}
