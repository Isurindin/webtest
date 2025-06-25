package com.example.webtest.control;

import com.example.webtest.service.UserService;
import com.example.webtest.vo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/user_list.action")
public class UserListControl extends HttpServlet {

    private UserService service = UserService.getInstance();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Users> userList = service.queryUserList();
        request.setAttribute("userList", userList);
        request.getRequestDispatcher("./user_list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
