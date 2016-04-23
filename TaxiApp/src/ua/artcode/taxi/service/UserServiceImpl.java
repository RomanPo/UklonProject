package ua.artcode.taxi.service;

import ua.artcode.taxi.dao.UserDao;
import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Message;
import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

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
    public String login(String phone, String pass) throws LoginException {

        User found = userDao.findByPhone(phone);



        if(found == null || !found.getPass().equals(pass)){
            throw new LoginException("User not found or incorrect password");
        }

        String accessKey = UUID.randomUUID().toString();
        accessKeys.add(accessKey);

        return accessKey;
    }

    @Override
    public Order makeOrder(String accessToken, String from, String to) throws OrderMakeException {
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
