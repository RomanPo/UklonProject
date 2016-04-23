package ua.artcode.taxi.test;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.service.UserServiceImpl;
import ua.artcode.taxi.view.MainTaxi;

public class testMainView {


    public static void main(String[] args) {
        new MainTaxi(new UserServiceImpl(new UserDaoInnerDbImpl(new AppDB())));
        //

    }
}