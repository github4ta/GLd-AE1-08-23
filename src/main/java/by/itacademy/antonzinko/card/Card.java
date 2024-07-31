package by.itacademy.antonzinko.card;

public class Card {
    private String number;
    private String expiredData;
    private String holder;

    public Card() {
    }

    public Card(String number, String expiredData, String holder) {
        this.number = number;
        this.expiredData = expiredData;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpiredData() {
        return expiredData;
    }

    public void setExpiredData(String expiredData) {
        this.expiredData = expiredData;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
