package service;

import model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);
}