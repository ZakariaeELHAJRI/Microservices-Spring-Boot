package com.zakariae.MicroServiceUser.services;

import java.util.List;
import com.zakariae.MicroServiceUser.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
