package com.example.webtest.dao.Impl;

import com.example.webtest.dao.UserDao;
import com.example.webtest.tools.JDBCTool;
import com.example.webtest.vo.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zzw
 * @date 2025/6/24-9:18
 */
public class UserDaoImpl implements UserDao {
    @Override
    public Users userLogin(Users users) {
        try {
            Connection conn = JDBCTool.getConnection();
            String sql = "select * from users where username=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, users.getUsername());
            ps.setString(2, users.getPassword());
            ResultSet set = ps.executeQuery();
            while (set.next()) {
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
                users = new Users(id, workCode, username, password, department, post, registerDate, gender, telephone, birthDate, email);
                return users;
            }
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Users> queryUserList() {
        List<Users> list = new ArrayList<>();
        try {
            Connection conn = JDBCTool.getConnection();
            String sql = "select * from users order by id desc limit 0,10";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet set = ps.executeQuery();
            while (set.next()) {
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
                Users user = new Users(id, workCode, username, password, department, post, registerDate, gender, telephone, birthDate, email);
                list.add(user);
            }
//            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public int insertUser(Users user) {
        try {
            Connection conn = JDBCTool.getConnection();
            String sql = "insert into users(work_code,username,password,department,post,register_date,gender,telephone,birth_date,email) value (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            // 通过statement的setXX方法，完成参数的传递
            statement.setString(1, user.getWorkCode());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getDepartment());
            statement.setString(5, user.getPost());
            statement.setString(6, user.getRegisterDate());
            statement.setString(7, user.getGender());
            statement.setString(8, user.getTelephone());
            statement.setString(9, user.getBirthDate());
            statement.setString(10, user.getEmail());
            // conn.close();
            return statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteUser(Users user) {
        try {
            int rows = 0;
            Connection conn = JDBCTool.getConnection();
            conn.setAutoCommit(true);
            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, user.getId());
            rows = ps.executeUpdate();

            //conn.close();
            return rows;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateUser(Users users) {
        try {
            String sql = "update users set work_code=?,username=?,password=?,department=?,post=?,gender=?,telephone=?,email=? where id=?";
            Connection conn = JDBCTool.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,users.getWorkCode());
            statement.setString(2,users.getUsername());
            statement.setString(3,users.getPassword());
            statement.setString(4,users.getDepartment());
            statement.setString(5,users.getPost());
            statement.setString(6,users.getGender());
            statement.setString(7,users.getTelephone());
            statement.setString(8,users.getEmail());
            statement.setInt(9,users.getId());
            int rows = statement.executeUpdate();
           // conn.close();
            return rows;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }



    @Override
    public Users queryUserById(String id) {
        try {
            Connection conn = JDBCTool.getConnection();
            String sql = "select * from users where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet set = ps.executeQuery();
            Users users = null;
            while (set.next()){
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
                users = new Users(set.getInt("id"),workCode,username,password,department,post,registerDate,gender,telephone,birthDate,email);
            }
        //    conn.close();
            return users;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

