package by.itacademy.sergeymelnik.user;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Users.getUsers());
        }
        User user = new User(null, null);
        System.out.println("user with null " + user.toString());
    }
}
