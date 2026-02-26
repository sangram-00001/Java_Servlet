package com.giet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CommonServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest req,
                                  HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Handled by Common Method</h2>");
    }

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws IOException {
        processRequest(req, res);
    }

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws IOException {
        processRequest(req, res);
    }
}