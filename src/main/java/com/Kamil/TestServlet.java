package com.Kamil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.servlet.ServletRequestContext;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Operations")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//            ServletRequestContext requestContext = new ServletRequestContext(req); Removed in jakarta servlet

        System.out.println("It works!!!");
        PrintWriter out = resp.getWriter();
        out.println("It works!!!");
    }
}
