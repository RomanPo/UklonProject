package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Driver;
import ua.artcode.taxi.model.Order;

import java.util.List;

/**
 * Created by tos on 4/23/16.
 */
public interface DriverDao {

    // return Driver with id
    Driver create(Driver user);

    String getDriverLocation();

   // Driver findByPhone(String phone);

    Driver findById(int id);

    Driver setToBlackList(int id);

    Order findOrder(List<Order> Orders);

}
