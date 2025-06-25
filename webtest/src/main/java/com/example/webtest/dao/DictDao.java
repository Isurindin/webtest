package com.example.webtest.dao;

import com.example.webtest.dao.Impl.DictDaoImpl;

import java.util.Map;

public interface DictDao {
    static DictDao getInstance() {
        return new DictDaoImpl();
    }
    Map<String,String> getJobType();
}