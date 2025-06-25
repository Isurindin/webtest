package com.example.webtest.control;


import com.example.webtest.service.UserService;
import com.example.webtest.tools.DateTool;
import com.example.webtest.vo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    /**
     * @author PJM
     * @date 2025/6/25-15:34
     */
    @WebServlet("/user_insert.action")
    public class UserInsertControl extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            String workCode = request.getParameter("workCode");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String department = request.getParameter("department");
            String post = request.getParameter("post");
            String registerDate = DateTool.getDateTime();
            String gender = request.getParameter("gender");
            String telephone = request.getParameter("telephone");
            String birthDate = request.getParameter("birthDate");
            String email = request.getParameter("email");
            Users user = new Users(null,workCode,username,password,department,post,registerDate,gender,telephone,birthDate,email);
            UserService service = UserService.getInstance();
            int rows = service.insertUser(user);
            if (rows>0){
                response.sendRedirect("./user_list.action");
            }else {
                request.setAttribute("addErr","数据添加失败，请联系开发商！");
                request.getRequestDispatcher("./user_add.jsp").forward(request,response);
            }
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request, response);
        }
    }

