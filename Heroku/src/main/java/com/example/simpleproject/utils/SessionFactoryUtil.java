package com.example.simpleproject.utils;

import model.CategoriesEntity;
import model.GoodsEntity;
import model.RatesEntity;
import model.UsersEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private SessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(CategoriesEntity.class);
                configuration.addAnnotatedClass(GoodsEntity.class);
                configuration.addAnnotatedClass(RatesEntity.class);
                configuration.addAnnotatedClass(UsersEntity.class);
                StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(registryBuilder.build());

            } catch (Exception e) {
                System.out.println("Exception getSessionFactory !" + e);
            }
        }
        return sessionFactory;
    }
}

