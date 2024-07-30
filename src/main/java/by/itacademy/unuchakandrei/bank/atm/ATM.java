package by.itacademy.unuchakandrei.bank.atm;

import java.util.Objects;

public class ATM {
    private String number;
    private String address;
    private String moneyAmount;

    public ATM(String number, String address, String moneyAmount) {
        setNumber(number);
        setAddress(address);
        setMoneyAmount(moneyAmount);
    }

    public void setNumber(String number) {
        if (number == null) {
            throw new NullPointerException();
        }
        if (number.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public void setAddress(String address) {
        if (address == null) {
            throw new NullPointerException();
        }
        if (address.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.address = address;
    }

    public void setMoneyAmount(String moneyAmount) {
        if (moneyAmount == null) {
            throw new NullPointerException();
        }
        if (moneyAmount.isEmpty()) {
            throw new IllegalArgumentException();
        }
        String regex = "^\\d*\\.?\\d*$";
        if (!moneyAmount.matches(regex)) {
            throw new IllegalArgumentException();
        }
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
