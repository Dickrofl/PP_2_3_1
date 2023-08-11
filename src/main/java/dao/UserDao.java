package dao;

import model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);
}