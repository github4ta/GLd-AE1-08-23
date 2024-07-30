package by.itacademy.pavelyatsevich.user;

import net.datafaker.Faker;

public class Users {

    public static User generateRandomUser() {
        Faker faker = new Faker();
        return new User(faker.internet().username(), faker.internet().password(7, 15, true, true, true));
    }
}
