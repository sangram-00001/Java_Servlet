package com.text;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Static authentication
        if(role.equals("admin") && username.equals("admin") && password.equals("admin123")){

            HttpSession session = request.getSession();
            session.setAttribute("user", username);
            session.setAttribute("role", role);

            response.sendRedirect("dashboard");

        }
        else if(role.equals("user") && username.equals("user") && password.equals("user123")){

            HttpSession session = request.getSession();
            session.setAttribute("user", username);
            session.setAttribute("role", role);

            response.sendRedirect("dashboard");

        }
        else{

            out.println("<h2>Invalid Username or Password</h2>");
            out.println("<a href='login.html'>Try Again</a>");

        }
    }
}