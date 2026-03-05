package com.text;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if(session == null){
            response.sendRedirect("index.html");
            return;
        }

        String role = (String) session.getAttribute("role");

        if(role.equals("admin")){
            out.println("<h1>Welcome Admin</h1>");
        }
        else{
            out.println("<h1>Welcome User</h1>");
        }

        out.println("<br>");
        out.println("<a href='logout'>Logout</a>");
    }
}