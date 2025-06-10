package com.va.week6.servlet;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.va.week6.dao.StudentDao;
import com.va.week6.model.Student;


@jakarta.servlet.annotation.WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private StudentDao stDao;

    public void init() {
        stDao = new StudentDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // These are now: username, email, password
        String firstName = request.getParameter("firstname");  // username
        String lastName = request.getParameter("lastname");    // email
        String grade = request.getParameter("grade");          // password

        Student st = new Student();
        st.setFirstname(firstName);
        st.setLastname(lastName);
        st.setGrade(grade);

        try {
            stDao.registerStudent(st);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("success.jsp");
    }
}
