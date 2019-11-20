package cn.itcast.web.request;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo5")
public class RequestDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo55555555");

        //存储共享数据到request
        request.setAttribute("msg","hello");

        //转发到demo6资源
        request.getRequestDispatcher("/RequestDemo6").forward(request,response);
        //request.getRequestDispatcher("https://www.runoob.com").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);

    }
}
