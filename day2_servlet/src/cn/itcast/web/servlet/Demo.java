package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo")
public class Demo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        (*)获取虚拟目录
            String getContextPath()
         (*)获取请求的URL
            String getRequestURI()
            StringBuffer getRequestURL()
         */
        String contextPath = request.getContextPath();
        StringBuffer requestURL = request.getRequestURL();
        String requestURI = request.getRequestURI();
        System.out.println(contextPath);
        System.out.println(requestURL);
        System.out.println(requestURI);
    }
}
