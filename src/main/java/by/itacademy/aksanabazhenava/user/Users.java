package by.itacademy.aksanabazhenava.user;

import com.github.javafaker.Faker;

import java.io.UnsupportedEncodingException;

public class Users {
    public static User generateRandomUser() throws UnsupportedEncodingException {
        Faker faker = new Faker();
        return new User(faker.internet().userAgentAny(), faker.internet().password());
    }
}
