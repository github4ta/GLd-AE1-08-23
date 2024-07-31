package by.itacademy.unuchakandrei.bank.atm;

import java.util.Objects;
import java.util.Random;

public class ATM {
    private String number;
    private String address;
    private int moneyAmount;

    public ATM(String number, String address, int moneyAmount) {
        setNumber(number);
        setAddress(address);
        setMoneyAmount(moneyAmount);
    }

    public void setNumber(String number) {
        if (number.isEmpty()) {
            this.number = generateRandomNumber();
        } else {
            this.number = number;
        }
    }

    private String generateRandomNumber() {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            number.append(new Random().nextInt(0, 10));
        }
        return number.toString();
    }

    public void setAddress(String address) {
        if (address.isEmpty()) {
            this.address = "N/A";
        } else {
            this.address = address;
        }
    }

    public void setMoneyAmount(int moneyAmount) {
        if (moneyAmount < 0) {
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

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public boolean equals(ATM atm) {
        if (this == atm) return true;
        if (atm == null) return false;
        return number.equals(atm.number) && address.equals(atm.address) && moneyAmount == atm.moneyAmount;
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
