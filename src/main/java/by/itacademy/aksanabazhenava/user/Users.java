package by.itacademy.aksanabazhenava.user;

import com.github.javafaker.Faker;

public class Users {
    public static User generateRandomUser() {
        Faker faker = new Faker();
        System.out.println(faker.name().firstName() + " " + faker.internet().password());
        return new User();
    }
}
