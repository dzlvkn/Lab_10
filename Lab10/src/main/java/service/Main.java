package service;
import Modul.User;

public class Main {

    public static void main(String[] args) {

        InputUser inputUser = new InputUser();
        User user = inputUser.checkUser();

        if (user == null) {
            System.out.println("К сожалению такого пользователя не существует. Программа завершена!");
            return;
        }

        String userName = user.getUserName();
        Programm programm = new Programm();
        programm.doProgramm(user);

    }
}
