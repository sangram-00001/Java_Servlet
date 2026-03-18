package com.pack;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/SetColorServlet")
public class SetColorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String color = request.getParameter("color");

        Cookie cookie = new Cookie("favoriteColor", color);
        response.addCookie(cookie);

        PrintWriter out = response.getWriter();
        out.println("Favorite color stored successfully.");
        out.println("<br><a href='GetColorServlet'>Show Favorite Color</a>");
    }
}