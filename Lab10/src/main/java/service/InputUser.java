package service;
import java.util.Scanner;
import Modul.User;

public class InputUser {

    public User checkUser() {

        User[] allUsers = User.getAll();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя:");
        String login = scanner.nextLine();

        System.out.println("Введите пароль:");
        String parol = scanner.nextLine();

        for (User user: allUsers) {
            if (login.equals(user.getUserName()) && parol.equals(user.getPassword())) {
                return user;
            }
        }

        return null;
    }
}
