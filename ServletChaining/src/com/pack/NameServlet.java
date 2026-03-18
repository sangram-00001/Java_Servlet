package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NameServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        request.setAttribute("name", name);

        RequestDispatcher rd =
                request.getRequestDispatcher("CityServlet");

        rd.forward(request, response);
    }
}