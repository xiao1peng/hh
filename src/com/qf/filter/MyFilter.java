package com.qf.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获取请求路径
        String uri = request.getRequestURI();
        if (uri.contains("login.jsp") || uri.contains("userServlet")){
            filterChain.doFilter(request,response);
        }else {
            HttpSession session = request.getSession();
            String uname = (String) session.getAttribute("uname");
            if(uname == null || "".equals(uname)){
                request.setAttribute("msg","非法登录，小心腿打断！");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }else {
                filterChain.doFilter(request,response);
            }
        }
    }
}
