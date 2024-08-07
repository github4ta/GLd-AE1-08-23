package by.itacademy.yatsevichpavel.card;

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

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardHolder, card.cardHolder) && Objects.equals(expiredDate, card.expiredDate) && Objects.equals(cardNumber, card.cardNumber);
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
