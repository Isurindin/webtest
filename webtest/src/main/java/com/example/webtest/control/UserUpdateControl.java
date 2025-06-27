package com.example.webtest.control;

import com.example.webtest.service.UserService;
import com.example.webtest.vo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author PJM
 * @date 2025/6/27-9:11
 */
@WebServlet("/user_update.action")
public class UserUpdateControl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserService service = UserService.getInstance();
        Users user = service.queryUserById(id);
        // 将查询的数据放入到request域中，在jsp中显示数据
        request.setAttribute("user",user);
        request.getRequestDispatcher("./user_add.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}