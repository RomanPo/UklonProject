package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Order;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 24.04.16
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 */
public class OrderDaoImplmpl implements OrderDao {
   AppDB appDB;

    @Override
    public Order createOrder(Order order) {
       return appDB.addOrder(order);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Order cancelOrder(long orderId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Order updateOrder(long orderId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
