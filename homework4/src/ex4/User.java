package ex4;

import java.util.Arrays;

public class User {
    private String name;
    private String password;
    private Message[] message;

    public User(String name, String password, Message[] message) {
        this.name = name;
        this.password = password;
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMessage(Message[] message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", message=" + Arrays.toString(message) +
                '}';
    }
}
