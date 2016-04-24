package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Order;

public interface OrderDao {

    Order createOrder(long orderId);
    Order cancelOrder(long orderId);
    Order updateOrder(long orderId);
}
