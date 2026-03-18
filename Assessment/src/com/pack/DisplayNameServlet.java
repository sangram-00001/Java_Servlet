package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DisplayNameServlet")
public class DisplayNameServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Welcome " + name + "</h2>");
    }
}
