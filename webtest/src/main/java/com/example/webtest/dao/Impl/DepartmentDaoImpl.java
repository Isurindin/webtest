package com.example.webtest.dao.Impl;

import com.example.webtest.dao.DepartmentDao;
import com.example.webtest.tools.JDBCTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public Map<String, String> getDepartment() {
        Map<String, String> departmentMap = new HashMap<String, String>();
        try {
            Connection conn = JDBCTool.getConnection();
            String sql = "select * from department";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet set = ps.executeQuery();
            while (set.next()) {
                String key = set.getString("id");
                String value = set.getString("name");
                departmentMap.put(key, value);
            }
            //conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return departmentMap;
    }
}