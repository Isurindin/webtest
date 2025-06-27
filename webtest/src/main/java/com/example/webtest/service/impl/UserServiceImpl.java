package com.example.webtest.service.impl;


import com.example.webtest.dao.UserDao;
import com.example.webtest.service.UserService;
import com.example.webtest.vo.Users;

import java.util.List;

/**
 * @author PJM
example.webtest * @date 2025/6/24-9:13
 */
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

    @Override
    public int insertUser(Users users) {
        return userDao.insertUser(users);
    }

    @Override
    public int deleteUser(Users users){
        return UserDao.getInstance().deleteUser(users);
    }

    @Override
    public Users queryUserById(String id) {
        return userDao.queryUserById(id);
    }
}
