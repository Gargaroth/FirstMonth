package ex4;

import java.util.Arrays;
import java.util.Scanner;

public class OneGramChat {
    static User[] users;

    public OneGramChat(User[] users) {
        this.users = users;
    }

    public void NewUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Запуск функции создать пользователя, придумайте Имя");
        String createName = in.nextLine();
        System.out.println("Придумайте Пароль");
        String createPassword = in.nextLine();
        User user = new User(createName, createPassword, new Message[100]);
        for (int i = 0; i < users.length; i++) {
            users[i] = user;
        }
    }

    public void InputUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Запуск функции войти пользователю, введите Имя");
        String inputName = in.nextLine();
        System.out.println("Введите Пароль");
        String inputPassword = in.nextLine();
        for (User element : users) {
            try {
                if (element.equals(null) && element.equals(null)) {
                    throw new Exception("Пользователя не существует");
                } else {
                    System.out.println("Вы вошли");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }break;
        }
    }

    public void ExitUser() {

    }

    public void SendMessage() {

    }

    public void ReadMessage() {

    }
}





