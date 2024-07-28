package by.itacademy.andreiunuchak.user;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        setLogin(login);
        setPassword(password);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null) throw new NullPointerException();
        if (!isEmailValid(login)) throw new IllegalArgumentException("Email address is not valid.");
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) throw new NullPointerException();
        if (password.isEmpty()) throw new IllegalArgumentException("Password can not be empty");
        this.password = password;
    }

    public boolean equals(User user) {
        if (this == user) return true;
        if (user == null) return false;
        return this.login.equals(user.login) && this.password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private boolean isEmailValid(String login) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(login);
        return mat.matches();
    }
}
