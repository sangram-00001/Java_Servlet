package com.pack;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/GetColorServlet")
public class GetColorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        PrintWriter out = response.getWriter();

        for(Cookie c : cookies){
            if(c.getName().equals("favoriteColor")){
                out.println("Your favorite color is: " + c.getValue());
            }
        }
    }
}