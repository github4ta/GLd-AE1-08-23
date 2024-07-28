package by.itacademy.pavelyatsevich.card;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

        return new EqualsBuilder().append(number, card.number).append(expiredDate, card.expiredDate).append(holder, card.holder).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(number).append(expiredDate).append(holder).toHashCode();
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
