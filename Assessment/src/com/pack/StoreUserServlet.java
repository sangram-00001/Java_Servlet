package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/storeUser")
public class StoreUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        HttpSession session = request.getSession();
        session.setAttribute("username", name);

        response.sendRedirect("showUser");
    }
}