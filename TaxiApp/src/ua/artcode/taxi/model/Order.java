package ua.artcode.taxi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by serhii on 23.04.16.
 */
public class Order {

    private long id;

    private Address from;

    private Address to;

    private User user;

    private User driver;

    private int price;

    private LocalDateTime makeOrderTime;

    private OrderStatus orderStatus;

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getFrom() {
        return from;
    }

    public void setFrom(Address from) {
        this.from = from;
    }

    public Address getTo() {
        return to;
    }

    public void setTo(Address to) {
        this.to = to;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getMakeOrderTime() {
        return makeOrderTime;
    }

    public void setMakeOrderTime(LocalDateTime makeOrderTime) {
        this.makeOrderTime = makeOrderTime;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", user=" + user +
                ", driver=" + driver +
                ", price=" + price +
                ", makeOrderTime=" + makeOrderTime +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
