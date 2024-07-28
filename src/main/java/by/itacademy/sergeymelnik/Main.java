package by.itacademy.sergeymelnik;

import by.itacademy.sergeymelnik.user.User;
import by.itacademy.sergeymelnik.user.Users;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println(Users.getUsers());
        }
        User user = new User(null, "asdfa");

    }
}
