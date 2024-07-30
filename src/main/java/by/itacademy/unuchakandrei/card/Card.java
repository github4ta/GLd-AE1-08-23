package by.itacademy.unuchakandrei.card;

import java.util.Objects;

public class Card {
    private String cardHolder;
    private String expiredDate;
    private String cardNumber;

    public Card(String cardHolder, String expiredDate, String cardNumber) {
        setCardHolder(cardHolder);
        setExpiredDate(expiredDate);
        setCardNumber(cardNumber);
    }

    public void setCardHolder(String cardHolder) {
        if (cardHolder == null) {
            throw new NullPointerException();
        }
        if (cardHolder.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.cardHolder = cardHolder;
    }

    public void setExpiredDate(String expiredDate) {
        if (expiredDate == null) {
            throw new NullPointerException();
        }
        if (!expiredDate.matches("[0-1][0-9]/[0-9][0-9]")) {
            throw new IllegalArgumentException();
        }
        int month = Integer.parseInt(expiredDate.split("/")[0]);
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException();
        }
        this.expiredDate = expiredDate;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber == null) {
            throw new NullPointerException();
        }
        if (!cardNumber.matches("[0-9]".repeat(16))) {
            throw new IllegalArgumentException();
        }
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
