package ua.artcode.taxi.dao;

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

    User findByPhone(String phone);

    User findById(int id);

    User delete(int id);

    User update(User newUser);



}
