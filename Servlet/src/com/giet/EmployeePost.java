package com.giet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class EmployeePost extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h3>Employee Details</h3>");
        out.println("Name: " + req.getParameter("name") + "<br>");
        out.println("Salary: " + req.getParameter("salary") + "<br>");
        out.println("Department: " + req.getParameter("department"));
    }
}