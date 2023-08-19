package com.qf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userServlet",urlPatterns = "/userServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object uname = req.getParameter("uname");
        Object upwd = req.getParameter("upwd");
        if ("admin".equals(uname) && "123456".equals(upwd)){
            resp.sendRedirect("index.jsp");
        }else {
            req.setAttribute("msg","密码错误");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
