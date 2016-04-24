package ua.artcode.taxi.test;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.service.UserServiceImpl;
import ua.artcode.taxi.view.Registration;

public class TestRegistrationView {


    public static void main(String[] args) {
        AppDB appDB = new AppDB();
        new Registration(new UserServiceImpl(new UserDaoInnerDbImpl(new AppDB())));
        //

    }
}