package ua.artcode.taxi.service;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.UserDao;
import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.exception.UserNotFoundException;
import ua.artcode.taxi.model.*;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by serhii on 23.04.16.
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    private List<String> accessKeys = new ArrayList<>();
    private List<String> orederIds = new ArrayList<>();

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Message register(User user) throws RegisterException {
        // validation user object(phone, login, pass)

        User created = userDao.create(user);

        if(created == null){
            throw new RegisterException("can not create exception");
        }

        return new Message("user created", created.toString());
    }

    @Override
    public String login(String phone, String pass) throws LoginException, UserNotFoundException {

        User found = userDao.findByPhone(phone);



        if(found == null || !found.getPass().equals(pass)){
            throw new LoginException("User not found or incorrect password");
        }

        String accessKey = UUID.randomUUID().toString();
        accessKeys.add(accessKey);

        return accessKey;
    }



    @Override
    public Order makeOrder(String accessToken, Address from, Address to) throws OrderMakeException {
        if (!accessToken.equals(null)){
            Order order = new Order();
            order.setId(System.currentTimeMillis());
            order.setFrom(from);
            order.setTo(to);
            order.setOrderStatus(OrderStatus.NEW);
            order.setPrice(Calculator.calculateThePrice(order)); // find out how to implement
            //order.setUser(userDao.findById());
        }
    return null;
    }

    @Override
    public Order makeOrderAnonymous(String phone, String from, String to) throws OrderMakeException {
        return null;
    }

    @Override
    public Order submitOrder(Order order) throws OrderMakeException {
        return null;
    }

    @Override
    public Order getInfo(long orderId) throws OrderNotFoundException {
        return null;
    }

    @Override
    public Message cancelOrder(long orderId) throws OrderNotFoundException {
        return null;
    }

}
