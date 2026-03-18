package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ccc extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {


        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        HttpSession ss=request.getSession();
        String name=(String)ss.getAttribute("name");
        String city=(String)ss.getAttribute("city");

        if(name==null)name="Not Available";
        if(city==null)city="Not Available";

        System.out.println("Data Arrived");
        System.out.println("Name : " + name);
        System.out.println("City : " + city);

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Data Page</title>");
        pw.println("</head>");
        pw.println("<body>");

        pw.println("<h2>Data Saved Successfully</h2>");
        pw.println("Name : " + name + "<br>");
        pw.println("City : " + city + "<br><br>");

        pw.println("<form action='" + request.getContextPath() + "/index.html'>");
        pw.println("<button type='submit'>Go Back</button>");
        pw.println("</form>");

        pw.println("</body>");
        pw.println("</html>");
    }
}