package com.example.webtest.dao.Impl;

import com.example.webtest.dao.UserDao;
import com.example.webtest.tools.JDBCTool;
import com.example.webtest.vo.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public Users userLogin(Users users){
        try{
            Connection conn = JDBCTool.getConnection();
            String sql = "select * from users where username=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,users.getUsername());
            ps.setString(2,users.getPassword());
            ResultSet set = ps.executeQuery();
            while(set.next()){
                Integer id = set.getInt("id");
                String workCode = set.getString("work_code");
                String username = set.getString("username");
                String password = set.getString("password");
                String department = set.getString("department");
                String post = set.getString("post");
                String registerDate = set.getString("register_date");
                String gender = set.getString("gender");
                String telephone = set.getString("telephone");
                String birthDate = set.getString("birth_date");
                String email = set.getString("email");
                String role = set.getString("role");
                Integer state = set.getInt("state");
                users = new Users(id,workCode,username,password,department,post,registerDate,gender,telephone,birthDate,email);
                return users;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Users> queryUserList(){
        List<Users> list = new ArrayList<>();
        try{
            Connection conn = JDBCTool.getConnection();
            String sql = "select * from users order by id desc limit 0,10";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet set = ps.executeQuery();
            while(set.next()){
                Integer id = set.getInt("id");
                String workCode = set.getString("work_code");
                String username = set.getString("username");
                String password = set.getString("password");
                String department = set.getString("department");
                String post = set.getString("post");
                String registerDate = set.getString("register_date");
                String gender = set.getString("gender");
                String telephone = set.getString("telephone");
                String birthDate = set.getString("birth_date");
                String email = set.getString("email");
                String role = set.getString("role");
                Integer state = set.getInt("state");
                Users user = new Users(id,workCode,username,password,department,post,registerDate,gender,telephone,birthDate,email);
                list.add(user);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

        return list;
    }
}
