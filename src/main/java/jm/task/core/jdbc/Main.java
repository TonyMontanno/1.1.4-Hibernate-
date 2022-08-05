package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;



import static jm.task.core.jdbc.util.Util.connectionClose;

public class Main {
    public static void main(String[] args) {

        UserDao userService = new UserDaoHibernateImpl();
        userService.createUsersTable();
        userService.saveUser("Vasiliy", "Pupkin", (byte) 30);
        userService.saveUser("Gena", "Bukin", (byte) 50);
        userService.saveUser("Sveta", "Bublik", (byte) 25);
        userService.saveUser("Janna", "sAndijana", (byte) 22);
        userService.cleanUsersTable();
        userService.removeUserById(3);
        userService.dropUsersTable();
        connectionClose();

    }
}
