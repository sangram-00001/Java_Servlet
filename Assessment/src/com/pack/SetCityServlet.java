package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/setCity")
public class SetCityServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String city = request.getParameter("city");

        Cookie cookie = new Cookie("city", city);
        response.addCookie(cookie);

        response.sendRedirect("showCity");
    }
}
