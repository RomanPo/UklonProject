package ua.artcode.taxi.dao;

import ua.artcode.taxi.exception.UserNotFoundException;
import ua.artcode.taxi.model.User;

import java.util.Collection;

/**
 * Created by serhii on 23.04.16.
 */
public class UserDaoInnerDbImpl implements UserDao {

    private AppDB appDB;

    public UserDaoInnerDbImpl(AppDB appDB) {
        this.appDB = appDB;
    }

    @Override
    public User create(User user) {
        return appDB.addUser(user);
    }

    @Override
    public Collection<User> getAll() {
        return appDB.getUsers();
    }

    @Override
    public User findByPhone(String phone) {
        for (User user : appDB.getUsers()) {
            if (user.getPhone().equals(phone)) {
                return user;
            }
        }
        return null;

    }

    @Override
    public User findById(int id) {
        for (User user : appDB.getUsers()) {
            if (user.getId() == 0) {
                return user;
            }
        }
       return null; //return new UserNotFoundException();
    }

    @Override
    public User delete(int id) {
        for (User user : appDB.getUsers()) {
            if (user.getId() == id) {
                User user2 = user;
                appDB.getUsers().remove(user);
                return user2;
            }
        }
        //return new UserNotFoundException();
    }

    @Override
    public User update(User newUser) {
        return null;
    }
}
