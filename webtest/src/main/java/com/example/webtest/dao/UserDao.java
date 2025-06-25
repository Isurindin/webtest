package com.example.webtest.dao;

import com.example.webtest.dao.Impl.UserDaoImpl;
import com.example.webtest.vo.Users;

import java.util.List;

public interface  UserDao {
    static UserDao getInstance(){
        return new UserDaoImpl();
    }
    Users userLogin(Users users);


    List<Users> queryUserList();
}
