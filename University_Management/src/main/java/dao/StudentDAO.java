package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Student;
import util.HibernateUtil;

import java.util.List;

public class StudentDAO {

    public void saveStudent(Student s){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.save(s);

        tx.commit();
        session.close();
    }

    public void updateStudent(Student s){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.update(s);

        tx.commit();
        session.close();
    }

    public void deleteStudent(Student s){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.delete(s);

        tx.commit();
        session.close();
    }

    public List<Student> getAllStudents(){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Query<Student> q = session.createQuery("from Student", Student.class);

        List<Student> list = q.list();

        session.close();

        return list;
    }

}