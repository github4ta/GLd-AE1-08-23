package by.itacademy.sergeymelnik.user;

import java.util.Objects;

public class User {
    private String user;
    private String password;

    public User(String user, String password) {
        if (user == null && password == null) {
            this.user = "user";
            this.password = "password";
        }
        else if (user == null) {
            this.user = "user";
        }
        else if (password == null) {
            //  throw new IllegalArgumentException("User and password can not be empty");
            this.password = "password";
        }
        else {
            this.user = user;
            this.password = password;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        if (user == null) {
            //throw new IllegalArgumentException("User field can not be empty");
            this.user = "user";
        }else
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) {
            this.password = "password";
//            throw new IllegalArgumentException("Password can not be empty");
        }else
        this.password = password;
    }

    //@Override
    public boolean equals(User o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = o;
        return Objects.equals(user, user1.user) && Objects.equals(password, user1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
