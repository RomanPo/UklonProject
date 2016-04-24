package ua.artcode.taxi.test;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.UserDao;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.model.User;
import ua.artcode.taxi.service.UserServiceImpl;
import ua.artcode.taxi.view.MainTaxi;

public class TestMainView {


    public static void main(String[] args) {
        AppDB appDB = new AppDB();

        User user1 = new User("1234","test","Vasya",null);
        User user2 = new User("1111","test1","Ivan",null);
        UserDao userDao = new UserDaoInnerDbImpl(appDB);
        userDao.create(user1);
        userDao.create(user2);

        new MainTaxi(new UserServiceImpl(userDao));
        //

    }
}