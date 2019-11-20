package cn.itcast.web.request;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestDemo3")
public class RequestDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post获取请求参数


        //根据参数名称获取参数值
        /*String username = request.getParameter("username");
        *//*System.out.println("post");
        System.out.println(username);*//*

        //根据参数名称获取参数组
        String[] hobby = request.getParameterValues("hobby");
        for (String s : hobby) {
            //System.out.println(s);
        }*/

        //获取所有请求的参数名称  Enumeration相当于迭代器
        Enumeration<String> parameterNames = request.getParameterNames();
        /*while (parameterNames.hasMoreElements()){
            System.out.println("--------");
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("--------");
        }*/
        //获取所有参数map集合
        Map<String, String[]> map = request.getParameterMap();
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            String[] strings = map.get(name);
            System.out.println(name);
            for (String value : strings) {
                System.out.println(value);
            }
            System.out.println("----------------");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get获取请求参数

        /*//根据参数名称获取参数值
        String username = request.getParameter("username");
        System.out.println("get");
        System.out.println(username);*/

        this.doPost(request,response);
    }
}
