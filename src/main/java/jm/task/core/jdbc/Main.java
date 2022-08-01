package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService =  new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Vasiliy", "Pupkin", (byte) 30);
        userService.saveUser("Gena", "Bukin", (byte) 50);
        userService.saveUser("Sveta", "Bublik", (byte) 25);
        userService.saveUser("Janna", "sAndijana", (byte) 22);
        userService.cleanUsersTable();
        userService.removeUserById(3);
        userService.dropUsersTable();

    }
}
