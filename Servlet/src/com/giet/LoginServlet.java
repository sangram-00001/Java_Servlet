package com.giet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if ("admin".equals(user) && "1234".equals(pass)) {
            out.println("<h2>Login Successful</h2>");
        } else {
            out.println("<h2>Invalid Credentials</h2>");
        }
    }
}