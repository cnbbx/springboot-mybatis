package com.cnbbx.mapper;

import com.cnbbx.model.User;

import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public User findUserInfo();
    public List<User> findUsers();
}
