package com.example.webtest.control;

import com.example.webtest.service.UserService;
import com.example.webtest.vo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login.action")
public class LoginControl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();
        UserService service = UserService.getInstance();
        Users users = new Users();
        users.setUsername(username);
        users.setPassword(password);
        users = service.userLogin(users);
        if(users == null) {
            request.setAttribute("loginErr", "用户名或密码错误");
            request.getRequestDispatcher("./login.jsp").forward(request, response);
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("userInfo", users);
            response.sendRedirect("./main.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

}
