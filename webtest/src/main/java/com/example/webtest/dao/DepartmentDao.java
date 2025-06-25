package com.example.webtest.dao;

import com.example.webtest.dao.Impl.DepartmentDaoImpl;

import java.util.Map;

public interface DepartmentDao {
    static DepartmentDao getDepartmentDao() {
        return new DepartmentDaoImpl();
    }
    Map<String,String> getDepartment();
}