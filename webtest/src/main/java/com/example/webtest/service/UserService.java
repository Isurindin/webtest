package com.example.webtest.service;

import com.example.webtest.service.impl.UserServiceImpl;
import com.example.webtest.vo.Users;

import java.util.List;

public  interface UserService {
    static UserService getInstance(){
        return new UserServiceImpl();
    }


    Users userLogin(Users users);

    List<Users> queryUserList();

    int insertUser(Users users);

    int deleteUser(Users users);


}
