package com.test;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

import org.hibernate.Cache;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int roll = Integer.parseInt(request.getParameter("roll"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String course = request.getParameter("course");
        String studentClass = request.getParameter("studentClass");

        Student s = new Student();

        s.setRoll(roll);
        s.setName(name);
        s.setAge(age);
        s.setCourse(course);
        s.setStudentClass(studentClass);


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.save(s);

        tx.commit();

        session.close();

        response.getWriter().println("Student saved successfully!");
    }
}