package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;


public class Main {
    public static void main(String[] args) {

        UserDao userService = new UserDaoHibernateImpl();
        userService.createUsersTable();
        userService.saveUser("Vasiliy", "Pupkin", (byte) 30);
        userService.saveUser("Gena", "Bukin", (byte) 50);
        userService.saveUser("Sveta", "Bublik", (byte) 25);
        userService.saveUser("Janna", "Lee", (byte) 22);
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
