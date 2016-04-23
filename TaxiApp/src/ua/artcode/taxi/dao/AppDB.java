package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Driver;
import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

import java.util.ArrayList;
import java.util.List;

// operations in application
public class AppDB {

    private static int userIdCounter;
    private static long orderIdCounter;
    private static int driversIdCounter;
    private List<User> users;
    private List<Order> orders;
    private List<Driver> drivers;

    public AppDB() {
        users = new ArrayList<>();
        orders = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    public AppDB(List<User> users, List<Order> orders, List<Driver> drivers) {
        this.users = users;
        this.orders = orders;
        this.drivers = drivers;
    }


    public User addUser(User user){
        user.setId(userIdCounter++);
        users.add(user);
        return user;
    }

    public Order addOrder(Order order){
        order.setId(orderIdCounter++);
        orders.add(order);
        return order;
    }

    public User findUser(String phone){
        for (User user : users) {
            if(user.getPhone().equals(phone)){
                return user;
            }
        }
        return null;
    }

    public User findById(int id){
        for (User user : users) {
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public Order findOrder(long id){
        for (Order order : orders) {
            if(order.getId() == id){
                return order;
            }
        }
        return null;
    }



    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public Driver addDriver(Driver driver) {

        return null;
    }
}
