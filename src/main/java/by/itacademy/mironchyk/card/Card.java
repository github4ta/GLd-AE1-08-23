package by.itacademy.mironchyk.card;

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

    public String getExpiredDate() {
        return expiredDate;
    }

    public String getHolder() {
        return holder;
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
