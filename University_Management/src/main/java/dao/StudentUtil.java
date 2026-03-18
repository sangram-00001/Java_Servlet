package dao;

import org.hibernate.Session;
import model.Student;
import util.HibernateUtil;

public class StudentUtil {

    public static Student getStudentById(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }
}