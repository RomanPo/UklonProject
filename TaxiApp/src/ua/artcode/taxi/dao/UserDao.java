package ua.artcode.taxi.dao;

import ua.artcode.taxi.exception.UserNotFoundException;
import ua.artcode.taxi.model.User;

import java.util.Collection;

/**
 * Created by serhii on 23.04.16.
 */

// CRUD, Create, Read, Update, Delete
public interface UserDao {

    // return user with id
    User create(User user);

    Collection<User> getAll();

    User findByPhone(String phone) throws UserNotFoundException;

    User findById(int id) throws UserNotFoundException;

    User delete(int id) throws UserNotFoundException;

    User update(User newUser);



}
