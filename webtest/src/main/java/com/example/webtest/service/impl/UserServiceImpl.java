package com.example.webtest.service.impl;

import com.example.webtest.dao.UserDao;
import com.example.webtest.service.UserService;
import com.example.webtest.vo.Users;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = UserDao.getInstance();

    @Override
    public Users userLogin(Users users) {
        // 进行业务逻辑处理
        return userDao.userLogin(users);
    }

    @Override
    public List<Users> queryUserList() {

        return userDao.queryUserList();
    }
}