package by.itacademy.unuchakandrei.bank.atm;

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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMoneyAmount(String moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getMoneyAmount() {
        return moneyAmount;
    }

    public boolean equals(ATM atm) {
        if (this == atm) return true;
        if (atm == null) return false;
        return number.equals(atm.number) && address.equals(atm.address) && moneyAmount.equals(atm.moneyAmount);
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
