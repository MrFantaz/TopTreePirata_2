package com.example.simpleproject.daoModel;


import com.example.simpleproject.utils.SessionFactoryUtil;
import model.UsersEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {
    public model.UsersEntity findById(int id) {
        return SessionFactoryUtil.getSessionFactory().openSession().get(model.UsersEntity.class, id);
    }
    
    public void save(model.UsersEntity user) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(UsersEntity user) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(UsersEntity user) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public model.RatesEntity findRateById(int id) {
        return SessionFactoryUtil.getSessionFactory().openSession().get(model.RatesEntity.class, id);
    }

    public List<UsersEntity> findAll() {
        String hql = "from UsersEntity";
        List<UsersEntity> users = (List<UsersEntity>)  SessionFactoryUtil.getSessionFactory().openSession().createQuery(hql).list();
        return users;
    }
}
