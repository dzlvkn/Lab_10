package service;
import Modul.User;

public class Programm {

    public void doProgramm(User user){

        if (user.getRole().equals("ADMIN")) {
            System.out.println("Добро пожаловать, администратор!");

        } else if (user.getRole().equals("USER")) {
            System.out.println("Добро пожаловать, пользователь!");

        } else {
            System.out.println("Неверный ввод!");
        }

     }

}
