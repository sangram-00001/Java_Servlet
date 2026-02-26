package com.giet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MultiplyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws IOException {

        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>Result = " + (a * b) + "</h3>");
    }
}