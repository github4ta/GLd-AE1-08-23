package by.itacademy.mironchyk;

import by.itacademy.mironchyk.card.Card;
import by.itacademy.mironchyk.card.Cards;

public class MainCard {
    public static void main(String[] args) {
        Card randomCard = Cards.generateRandomCard();
        System.out.println("Generated Card: " + randomCard);

        boolean isValid = Cards.isValid(randomCard);
        System.out.println("Is the card valid? " + isValid);
    }
}
