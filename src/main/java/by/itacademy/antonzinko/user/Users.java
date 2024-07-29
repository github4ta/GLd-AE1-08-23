package by.itacademy.antonzinko.user;

import com.github.javafaker.Faker;

public class Users {
    public static User generateRandomUser() {
        Faker faker = new Faker();
        String login = faker.name().firstName();
        String password = faker.internet().password();
        return new User(login, password);
    }
}
