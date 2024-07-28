package by.itacademy.aksanabazhenava.card;

import java.util.Objects;

public class Card {

    private String number;
    private String expiredDate;
    private String holder;

    public Card(String number, String expiredDate, String holder) {
        this.number = number;
        this.expiredDate = expiredDate;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(number, card.number) && Objects.equals(expiredDate, card.expiredDate) && Objects.equals(holder, card.holder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, expiredDate, holder);
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", expiredDate='" + expiredDate + '\'' +
                ", holder='" + holder + '\'' +
                '}';
    }
}
