package Modul;

public class User {

    private String userName;
    private String password;
    private String role;

    public User(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public static User[] getAll() {

        User[] users = {
                new User("User1", "12fgh6", "USER"),
                new User("User2", "98dgjd", "USER"),
                new User("User3", "52sain", "USER"),
                new User("User4", "eto2st", "ADMIN"),
                new User("User5", "52dsp", "USER")
        };

        return users;
    }
}
