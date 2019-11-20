package cn.itcast.web.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/demo2")
public class ServletDemo2 extends HttpServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("demo2....");
    }

    @Override
    public void init() throws ServletException {
                super.init();
    }
}
