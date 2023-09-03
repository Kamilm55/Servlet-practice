package com.Kamil;

import com.Kamil.Dao.StudentDao;
import com.Kamil.Model.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ShowStudent")
public class ShowStudent extends HttpServlet {
    StudentDao studentDao = new StudentDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userId = Integer.parseInt(req.getParameter("id"));

        Student st1 = studentDao.displayStudent(userId);

        req.setAttribute("student",st1);
        RequestDispatcher rd = req.getRequestDispatcher("./Student.jsp");
        rd.forward(req,resp);


    }
}
