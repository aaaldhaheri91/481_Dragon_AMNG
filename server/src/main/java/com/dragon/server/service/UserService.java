package com.dragon.server.service;

import com.dragon.server.entity.Role;
import com.dragon.server.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> getByUsername(String username);

    boolean create(User user);

    void changePassword(User user);

    void delete(User user);

    void addRole(User user, Role role);

    void removeRole(User user, Role role);
}
