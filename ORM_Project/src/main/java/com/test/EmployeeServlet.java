package com.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet("/saveEmployee")
public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee emp = new Employee();

        emp.setName(name);
        emp.setSalary(salary);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.save(emp);

        tx.commit();

        session.close();

        response.getWriter().println("Employee Saved Successfully");
    }
}