package cn.itcast.web.request;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置流的字符集
        request.setCharacterEncoding("utf-8");
        //获取请求的参数
        String username = request.getParameter("username");
        System.out.println(username);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}
