package main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Student;
import util.HibernateUtil;

public class MainApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();


        Student s = new Student();
        s.setName("Rahul");
        s.setAge(22);

        session.save(s);
        System.out.println("Student Saved");


        Student st = session.get(Student.class, 1);
        System.out.println("Student Name: " + st.getName());


        st.setAge(25);
        session.update(st);
        System.out.println("Student Updated");

        session.delete(st);
        System.out.println("Student Deleted");

        tx.commit();
        session.close();
    }
}