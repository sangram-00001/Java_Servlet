package com.giet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h3>Student Details</h3>");
        out.println("Name: " + req.getParameter("name") + "<br>");
        out.println("Age: " + req.getParameter("age") + "<br>");
        out.println("Course: " + req.getParameter("course") + "<br>");
        out.println("Gender: " + req.getParameter("gender"));
    }
}