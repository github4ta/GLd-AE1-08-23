package by.itacademy.andreiunuchak.user;

import com.github.javafaker.Faker;

public class Users {
    public static User generateRandomUser() {
        Faker faker = new Faker();
        String login = faker.internet().emailAddress();
        String password = faker.internet().password(8, 20, true, true, true);
        return new User(login, password);
    }
}
