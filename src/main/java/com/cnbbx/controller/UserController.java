package com.cnbbx.controller;

import com.cnbbx.model.User;
import com.cnbbx.service.UserService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/v1/user")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Get 1 users", notes = "requires noting", httpMethod = "GET")
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if (user != null) {
            System.out.println("user.getName():" + user.getName());
            logger.info("user.getAge():" + user.getAge());
        }
        return user;
    }

    @ApiOperation(value = "Get all users", notes = "requires noting", httpMethod = "GET")
    @RequestMapping("/getUsers")
    @ResponseBody
    public List<User> getUserInfos() {
        List<User> user = userService.getUsers();
        return user;
    }
}
