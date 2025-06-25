package com.example.webtest.dao.Impl;

import com.example.webtest.dao.DictDao;
import com.example.webtest.tools.JDBCTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class DictDaoImpl implements DictDao {
    @Override
    public Map<String, String> getJobType() {
        Map<String, String> jobMap = new HashMap<String, String>();
        try {
            Connection conn = JDBCTool.getConnection();
            String sql = "select * from sys_dict where dict_type='job_type'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet set = ps.executeQuery();
            while (set.next()) {
                String key = set.getString("dict_code");
                String value = set.getString("dict_type");
                jobMap.put(key, value);
            }
//                conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jobMap;
    }
}
