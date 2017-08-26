package com.cnbbx.mapper;

import com.cnbbx.model.User;

import java.util.List;

public interface UserMapper {
    public User findUserInfo();

    public List<User> findUsers();
}
