package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/showUser")
public class ShowUserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        String name = (String) session.getAttribute("username");

        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome " + name + "</h2>");
    }
}