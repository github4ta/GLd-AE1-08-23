package by.itacademy.yatsevichpavel.bank.atm;

import java.util.Objects;

public class ATM {
    private String number;
    private String address;
    private String moneyAmount;

    public ATM(String number, String address, String moneyAmount) {
        this.number = number;
        this.address = address;
        this.moneyAmount = moneyAmount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(String moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return Objects.equals(number, atm.number) && Objects.equals(address, atm.address) && Objects.equals(moneyAmount, atm.moneyAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, address, moneyAmount);
    }

    @Override
    public String toString() {
        return "ATM{" +
                "number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", moneyAmount='" + moneyAmount + '\'' +
                '}';
    }
}
