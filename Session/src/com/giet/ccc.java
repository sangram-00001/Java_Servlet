package com.giet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ccc extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String city = request.getParameter("city");

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<head><title>Result</title></head>");
        pw.println("<body>");


        pw.println("<h2>Submitted Details</h2>");
        pw.println("<h3>Name: " + name + "</h3>");
        pw.println("<h3>City: " + city + "</h3>");


        pw.println("</body>");
        pw.println("</html>");
    }
}
