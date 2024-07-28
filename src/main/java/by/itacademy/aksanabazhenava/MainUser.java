package by.itacademy.aksanabazhenava;

import by.itacademy.aksanabazhenava.user.Users;

public class MainUser {
    public static void main(String[] args) {
        System.out.println("Login and password:");
        System.out.println(Users.generateRandomUser());
    }
}
