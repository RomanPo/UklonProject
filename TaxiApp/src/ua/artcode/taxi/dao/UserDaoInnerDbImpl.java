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
    public User findByPhone(String phone) throws UserNotFoundException {
        User result = null;
        for (User user : appDB.getUsers()) {
            if (user.getPhone().equals(phone)) {
                result =  user;
            }
            else{
                throw new UserNotFoundException("User not found");
            }
        }
<<<<<<< HEAD
        return null;

=======
        return result;
>>>>>>> 03efcd8b6dbee57efd6e382ca0ab7abfb0a0724e
    }

    @Override
    public User findById(int id) throws UserNotFoundException {
        User result = null;
        for (User user : appDB.getUsers()) {
            if (user.getId() == 0) {
                return user;
            }
            else{
                throw new UserNotFoundException("User not found");
            }
        }
<<<<<<< HEAD
       return null; //return new UserNotFoundException();
=======
        return result;
>>>>>>> 03efcd8b6dbee57efd6e382ca0ab7abfb0a0724e
    }

    @Override
    public User delete(int id) throws UserNotFoundException {
        User result = null;
        for (User user : appDB.getUsers()) {
            if (user.getId() == id) {
                User user2 = user;
                appDB.getUsers().remove(user);
                return user2;
            }
            else{
                throw new UserNotFoundException("User not found");
            }
        }
<<<<<<< HEAD
        //return new UserNotFoundException();
=======
       return result;
>>>>>>> 03efcd8b6dbee57efd6e382ca0ab7abfb0a0724e
    }

    @Override
    public User update(User newUser) {
        return null;
    }
}
