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
 * @date 2025/6/25-15:50
 */
@WebServlet("/user_delete.action")
public class UserDeleteControl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr);

        Users users = new Users();
        users.setId(id);

        UserService service = UserService.getInstance();
        int rows = service.deleteUser(users);
        if (rows > 0) {
            response.sendRedirect("./user_list.action");
        } else {
            request.setAttribute("deleteErr", "删除失败!");
            request.getRequestDispatcher("./user_list.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}


