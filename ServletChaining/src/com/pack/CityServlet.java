package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CityServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String name =
                (String) request.getAttribute("name");

        String city =
                request.getParameter("city");

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.println("<html><body>");

        pw.println("<h2>Data Saved Successfully</h2>");

        pw.println("Name: " + name + "<br>");
        pw.println("City: " + city);

        pw.println("</body></html>");
    }
}