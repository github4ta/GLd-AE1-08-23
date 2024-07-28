package by.itacademy.andreiunuchak.card;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (number == null) {
            throw new NullPointerException();
        }
        if (number.length() != 16 || !isNumberCorrect(number)) {
            throw new IllegalArgumentException("Card number is not correct");
        }
        this.number = number;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        if (expiredDate == null) {
            throw new NullPointerException();
        }
        if (!isDateFormatCorrect(expiredDate)) {
            throw new IllegalArgumentException("Expiration date is not correct");
        }
        this.expiredDate = expiredDate;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        if (holder == null) {
            throw new NullPointerException();
        }
        if (holder.isEmpty() || !isHolderCorrect(holder)) {
            throw new IllegalArgumentException("Holder name is not correct");
        }
        this.holder = holder;
    }

    private boolean isHolderCorrect(String holder) {
        if (holder.split(" ").length != 2) {
            return false;
        }
        holder = holder.replace(" ", "");
        for (int i = 0; i < holder.length(); i++) {
            if (!Character.isAlphabetic(holder.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumberCorrect(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isDateFormatCorrect(String expiredDate) {
        Pattern pattern = Pattern.compile("[0-1][0-9]/[0-9][0-9]");
        Matcher mat = pattern.matcher(expiredDate);
        if (mat.matches()) {
            int cardMonth = Integer.parseInt(expiredDate.split("/")[0]);
            if (cardMonth >= 1 && cardMonth <= 12) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Card card) {
        if (this == card) return true;
        if (card == null) return false;
        return this.number.equals(card.number) && this.expiredDate.equals(card.expiredDate) && this.holder.equals(card.holder);
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
