package by.itacademy.pavelyatsevich.user;

import com.github.javafaker.Faker;

public class Users {

    public static User generateRandomUser(){
        Faker faker = new Faker();
        return new User(faker.name().username(),faker.internet().password());
    }
}
