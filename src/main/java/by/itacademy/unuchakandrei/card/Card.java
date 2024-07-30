package by.itacademy.unuchakandrei.card;

import java.util.Objects;

public class Card {
    private String cardHolder;
    private String expiredDate;
    private String cardNumber;

    public Card(String cardHolder, String expiredDate, String cardNumber) {
        this.cardHolder = cardHolder;
        this.expiredDate = expiredDate;
        this.cardNumber = cardNumber;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean equals(Card card) {
        if (this == card) return true;
        if (card == null) return false;
        return cardHolder.equals(card.cardHolder) && expiredDate.equals(card.expiredDate) && cardNumber.equals(card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardHolder, expiredDate, cardNumber);
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardHolder='" + cardHolder + '\'' +
                ", expiredDate='" + expiredDate + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
