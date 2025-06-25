package com.example.webtest.Listener;

import com.example.webtest.dao.DepartmentDao;
import com.example.webtest.dao.DictDao;
import com.example.webtest.dao.Impl.DictDaoImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Map;

@WebListener
public class ApplicationListener implements ServletContextListener{
    public ApplicationListener() {

    }
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        DictDao dictDao = new DictDaoImpl();
        Map<String,String> jobMap = dictDao.getJobType();
        application.setAttribute("jobMap", jobMap);

        DepartmentDao departDao = DepartmentDao.getDepartmentDao();
        Map<String,String> departMap = departDao.getDepartment();
        application.setAttribute("departMap", departMap);

    }
    public void contextDestroyed(ServletContextEvent sce) {

    }

}