package com.giet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RectangleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws IOException {

        int l = Integer.parseInt(req.getParameter("length"));
        int w = Integer.parseInt(req.getParameter("width"));

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>Area = " + (l * w) + "</h3>");
    }
}