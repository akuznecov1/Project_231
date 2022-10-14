package org.akuznecov.web.dao;

import org.akuznecov.web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}

