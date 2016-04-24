package ua.artcode.taxi.test;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.UserDao;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.exception.UserNotFoundException;
import ua.artcode.taxi.model.User;
import ua.artcode.taxi.service.UserService;
import ua.artcode.taxi.service.UserServiceImpl;

import javax.jws.soap.SOAPBinding;
import javax.security.auth.login.LoginException;

/**
 * Created by tos on 4/24/16.
 */
public class TestLoginUser {

    public static void main(String[] args) throws LoginException, UserNotFoundException {
        AppDB appDB = new AppDB();

        User user1 = new User("+3809345896","test","Vasya",null);
        User user2 = new User("+3802345896","test1","Ivan",null);
        UserDao userDao = new UserDaoInnerDbImpl(appDB);
        userDao.create(user1);
        userDao.create(user2);

        System.out.println(appDB.toString());
        UserService userService = new UserServiceImpl((UserDaoInnerDbImpl) userDao);
        testLoginPositive(userService);
    }


    public static boolean  testLoginPositive(UserService userService) throws LoginException, UserNotFoundException {
        String accessKey = userService.login("+3809345896","test");

        System.out.println(accessKey);
        if (!accessKey.equals(null)){
            return true;
        }
        return false;
    }

   public static boolean testLoginNegative(UserService userService){

       return false;
   }

    public static boolean testLoginUserNotFound(UserDao userDao, AppDB appDB){
        return false;
    }
}
