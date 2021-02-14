package pl.sebroz.liquidbaseapplication.services;

import pl.sebroz.liquidbaseapplication.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User newUser();

    void saveUser(User user);
}
