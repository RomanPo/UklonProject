package ua.artcode.taxi.service;

import ua.artcode.taxi.model.Driver;
import ua.artcode.taxi.model.Message;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 23.04.16
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
public interface DriverService {
    Message register(Driver driver);
    String login(Driver driver);

}
