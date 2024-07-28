package by.itacademy.sergeymelnik.user;

import com.github.javafaker.Faker;

public class Users {

    public static User getUsers() {
        //Faker faker = new Faker();
        return new User(new Faker().name().username(),
                new Faker().internet().password(7, 15, true, true, true));
    }

}
