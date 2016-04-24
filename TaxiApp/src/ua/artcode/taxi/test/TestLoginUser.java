package ua.artcode.taxi.test;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.UserDao;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.model.User;

/**
 * Created by tos on 4/24/16.
 */
public class TestLoginUser {

    public static void main(String[] args) {
        AppDB appDB = new AppDB();

        User user1 = new User("1","+3809345896","test","Vasya");
        User user2 = new User("2","+3802345896","test1","Ivan");
        UserDao userDao = new UserDaoInnerDbImpl(appDB);
        userDao.create(user1);
        userDao.create(user2);

    }


    public static void testLoginPositive(User user, AppDB appDB){

    }

   public static void testLoginNegative(User user, AppDB appDB){

   }

    public static void testLoginUserNotFound(User user, AppDB appDB){

    }
}
