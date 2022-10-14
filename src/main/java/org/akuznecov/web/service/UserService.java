package org.akuznecov.web.service;

import org.akuznecov.web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser( User user);
}
