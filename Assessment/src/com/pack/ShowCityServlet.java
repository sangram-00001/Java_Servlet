package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/showCity")
public class ShowCityServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        PrintWriter out = response.getWriter();

        for (Cookie c : cookies) {
            if (c.getName().equals("city")) {
                out.println("Your city: " + c.getValue() );
            }
        }
    }
}