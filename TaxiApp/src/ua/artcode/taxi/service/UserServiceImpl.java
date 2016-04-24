package ua.artcode.taxi.service;

import ua.artcode.taxi.dao.OrderDao;
import ua.artcode.taxi.dao.UserDao;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.exception.UserNotFoundException;
import ua.artcode.taxi.model.*;
import ua.artcode.taxi.utils.geolocation.GoogleMapsAPI;
import ua.artcode.taxi.utils.geolocation.GoogleMapsAPIImpl;
import ua.artcode.taxi.utils.geolocation.Location;

import javax.security.auth.login.LoginException;
import java.util.*;

/**
 * Created by serhii on 23.04.16.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private OrderDao orderDao;
    private double pricePerKilometer = 5;
    private GoogleMapsAPI googleMapsAPI = new GoogleMapsAPIImpl();
    private Map<String, User> accessKeys = new HashMap<>();
    private List<String> orederIds = new ArrayList<>();


    public UserServiceImpl(UserDao userDao, OrderDao orderDao) {
        this.userDao = userDao;
        this.orderDao = orderDao;
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Message register(User user) throws RegisterException {
        // validation user object(phone, login, pass)

        User created = userDao.create(user);

        if (created == null) {
            throw new RegisterException("can not create exception");
        }

        return new Message("user created", created.toString());
    }

    @Override
    public String login(String phone, String pass) throws LoginException, UserNotFoundException {

        User found = userDao.findByPhone(phone);


        if (found == null || !found.getPass().equals(pass)) {
            throw new LoginException("User not found or incorrect password");
        }

        String accessKey = UUID.randomUUID().toString();
        accessKeys.put(accessKey, found);

        return accessKey;
    }

    @Override
    public Order makeOrder(String accessToken, Address from, Address to) throws OrderMakeException, UserNotFoundException {
        if (accessToken.equals(null)) {
            Order order = new Order();
            order.setId(System.currentTimeMillis());
            order.setFrom(from);
            order.setTo(to);
            order.setOrderStatus(OrderStatus.NEW);

            Location location = googleMapsAPI.findLocation(from.getCountry(), from.getCity(), from.getStreet(), from.getHouseNum());
            Location location1 = googleMapsAPI.findLocation(to.getCountry(), to.getCity(), to.getStreet(), to.getHouseNum());

            double price = pricePerKilometer * googleMapsAPI.getDistance(location, location1);

            order.setPrice((int) price);
            order.setUser(accessKeys.get(accessToken));
            return order;
        }
       throw new OrderMakeException("The Order was not created");
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
