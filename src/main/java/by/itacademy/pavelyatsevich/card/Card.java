package by.itacademy.pavelyatsevich.card;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Card {
    private String number;
    private String expiredDate;
    private String holder;

    public Card(String number, String expiredDate, String holder) {
        setNumber(number);
        setExpiredDate(expiredDate);
        setHolder(holder);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        cardNumberVerification(number);
        this.number = number;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        expiredDateVerification(expiredDate);
        this.expiredDate = expiredDate;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        holderVerification(holder);
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

    private static void cardNumberVerification(String number) {
        if (number == null) {
            throw new NullPointerException();
        }
        if (number.length() != 19) {
            throw new IllegalArgumentException("Incorrect data! Card number - " + number);
        }
    }

    private static void expiredDateVerification(String expiredDate) {
        if (expiredDate == null) {
            throw new NullPointerException();
        }
        String monthAdnYearRegex = "[0-1][0-9]/[0-9][0-9]";
        if (!expiredDate.matches(monthAdnYearRegex) || expiredDate.startsWith("00/00")) {
            throw new IllegalArgumentException("Incorrect data! Expired date - " + expiredDate);
        }
    }

    private static void holderVerification(String holder) {
        if (holder == null) {
            throw new NullPointerException();
        }
        String holderRegex = "/^[a-z ,.'-]+$/i";
        if (holder.isEmpty() || holder.matches(holderRegex)) {
            throw new IllegalArgumentException("Incorrect data! Holder - " + holder);
        }
    }
}
