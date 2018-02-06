package com.sangi.dao;

import com.sangi.model.User;

public interface UserDao {
 void registration(User user);
 boolean isEmailValid(String email);
 User login(User user);
}

