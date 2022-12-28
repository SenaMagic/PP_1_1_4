package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main {

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("One", "Man", (byte) 18);
        userDaoJDBC.saveUser("Two", "Woman", (byte) 24);
        userDaoJDBC.saveUser("Three", "Armored helicopter", (byte) 23);
        userDaoJDBC.saveUser("Four", "Man", (byte) 47);
        System.out.println(userDaoJDBC.getAllUsers());
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
