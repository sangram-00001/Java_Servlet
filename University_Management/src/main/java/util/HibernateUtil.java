package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.*;

public class HibernateUtil {

    private static SessionFactory factory;

    static{

        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(IDCard.class)
                .addAnnotatedClass(Address.class)
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){

        return factory;
    }
}