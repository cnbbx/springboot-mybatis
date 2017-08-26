package com.cnbbx.service;

import com.cnbbx.mapper.UserMapper;
import com.cnbbx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo() {
        User user = userMapper.findUserInfo();
        return user;
    }

    public List<User> getUsers() {
        List<User> user = userMapper.findUsers();
        return user;
    }

}
