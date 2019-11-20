package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据:referer
        /*String referer = request.getHeader("referer");
        System.out.println(referer);*/



        //演示获取请求头数据:user-agent
        String header = request.getHeader("user-agent");
        System.out.println(header);
    }
}
