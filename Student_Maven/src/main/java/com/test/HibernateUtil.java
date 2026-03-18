package com.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HibernateUtil {

    private static SessionFactory factory;

    static {
        factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return factory;
    }
}