package com.hy.www.service.impl;

import com.hy.www.mapper.UserMapper;
import com.hy.www.pojo.User;
import com.hy.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}