package com.example.webtest.tools;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTool {

    private static Connection conn = null;

    public static Connection getConnection() throws Exception{
        if(conn==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "root";
            String password = "20040216zzw";
            String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&useSSL=false&useUnicode=true&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
            conn = DriverManager.getConnection(url, username, password);
        }
        return conn;
    }

}
