package ua.artcode.taxi.run;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.service.UserService;
import ua.artcode.taxi.service.UserServiceImpl;

public class StartApp {


    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(new UserDaoInnerDbImpl(new AppDB()));
        //

    }
}
