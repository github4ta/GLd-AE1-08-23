package by.itacademy.sergeymelnik.card;

public class MainCard {
    public static void main(String[] args) {

       System.out.println("Generating 10 random cards");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1+"  "+Cards.getRandomCard());

        }
        System.out.println();
        Card newCard = Cards.getRandomCard();
        System.out.println("Check if card is valid  " + newCard.toString());
        System.out.println(Cards.isValid(newCard));

    }
}
