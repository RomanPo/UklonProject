package ua.artcode.taxi.service;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.exception.UserNotFoundException;

/**
 * Created by tos on 4/24/16.
 */
public class Validator {
    public boolean validatePassword(AppDB appDB, String phone, String password) throws RegisterException, UserNotFoundException {
        boolean result = false;
        if (password == "") {
            throw new RegisterException("Password is empty");
            //result = false;
        } else if (appDB.findUser(phone).equals(null)) {
            throw new UserNotFoundException("User is not found in the system. Please register");
        } else if (!(appDB.findUser(phone)).equals(null)) {
            if (appDB.findUser(phone).getPass().equals(password)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;

    }
}
