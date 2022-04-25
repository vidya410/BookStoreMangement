package com.bookStore.Service;

import com.bookStore.Bean.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public User getUserByUsername(String username);
}
