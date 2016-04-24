package ua.artcode.taxi.service;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Driver;
import ua.artcode.taxi.model.Message;
import ua.artcode.taxi.model.Order;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 23.04.16
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
public interface DriverService {
    Message register(Driver driver) throws RegisterException;
    //String login(Driver driver);
    List<Order> getOrders(AppDB appDB);

}
