package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Order;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 23.04.16
 * Time: 23:52
 * To change this template use File | Settings | File Templates.
 */
public interface OrderDao {

    Order createOrder(Order order);
    Order cancelOrder(long orderId);
    Order updateOrder(long orderId);
}
