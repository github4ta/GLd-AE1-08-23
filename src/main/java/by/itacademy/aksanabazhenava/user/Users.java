package by.itacademy.aksanabazhenava.user;

import com.github.javafaker.Faker;

public class Users {
    public static User generateRandomUser() {
        Faker faker = new Faker();
        String login = faker.name().firstName();
        String password = faker.internet().password(8, 10, true, true, true);
        return new User(login, password);
    }
}
