package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Order;

import java.util.List;

/**
 * Created by tos on 4/23/16.
 */
public class DriverDaoInnerDblImpl implements DriverDao {

    private AppDB appDB;

    public DriverDaoInnerDbImpl(AppDB appDB) {
        this.appDB = appDB;
    }

    @Override
    public Driver create(Driver driver) {
        return appDB.addUser(driver);
    }
    @Override
    public String getDriverLocation() {
        return null;
    }

    @Override
    public Driver findById(int id) {
        return null;
    }

    @Override
    public Driver setToBlackList(int id) {
        return null;
    }

    @Override
    public Order findOrder(List<Order> Orders){
        return null;
    }
}

