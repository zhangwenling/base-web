package cn.knet.showcase.demos.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhangwenling on 2015/11/6.
 */
@WebServlet(name = "TestServlet", urlPatterns={"/TestServlet"})
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println(request.getRequestURI());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("=========================");
        System.out.println(request.getRequestURI());
        return;
    }
}
