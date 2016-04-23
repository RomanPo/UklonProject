package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

import java.util.ArrayList;
import java.util.List;

// operations in application
public class AppDB {

    private static int userIdCounter;
    private static long orderIdCounter;
    private List<User> users;
    private List<Order> orders;
    private List<User> drivers;

    public AppDB() {
        users = new ArrayList<>();
        orders = new ArrayList<>();
        drivers = new ArrayList<>();
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

    public List<User> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<User> drivers) {
        this.drivers = drivers;
    }
}
