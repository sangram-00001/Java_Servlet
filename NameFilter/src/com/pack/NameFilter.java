package com.pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NameFilter implements Filter{
    public void inti(FilterConfig fc)
    {
        System.out.println("Filter Initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String lname= servletRequest.getParameter("lname");
        PrintWriter pw=servletResponse.getWriter();
        if(lname==null || lname.equals(" "))
        {
            pw.println("<h3>Surname is required!</h3>");
        }
        else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    public void destroy()
    {
        System.out.println("Filter destroyed");
    }
}
