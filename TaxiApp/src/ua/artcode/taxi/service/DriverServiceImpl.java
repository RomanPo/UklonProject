package ua.artcode.taxi.service;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.DriverDao;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Driver;
import ua.artcode.taxi.model.Message;
import ua.artcode.taxi.model.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tos on 4/24/16.
 */
public class DriverServiceImpl implements DriverService {

    private DriverDao driverDao;

    private List<String> orederIds = new ArrayList<>();

    public DriverServiceImpl(DriverDao userDao) {
        this.driverDao = driverDao;
    }

    @Override
    public Message register(Driver driver) throws RegisterException {
        Driver created = driverDao.create(driver);

        if(created == null){
            throw new RegisterException("can not create exception");
        }

        return new Message("driver created", created.toString());
    }

    @Override
    public List<Order> getOrders(AppDB appDB) {
        return null;
    }
}
