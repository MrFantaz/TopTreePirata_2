package daoModel;

import model.RatesEntity;
import model.UsersEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.SessionFactoryUtil;

import java.util.List;

public class UserDao {
    public UsersEntity findById(int id) {
        return SessionFactoryUtil.getSessionFactory().openSession().get(UsersEntity.class, id);
    }

    public void save(UsersEntity user) {
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

    public RatesEntity findRateById(int id) {
        return SessionFactoryUtil.getSessionFactory().openSession().get(RatesEntity.class, id);
    }

    public List<UsersEntity> findAll() {
        List<UsersEntity> users = (List<UsersEntity>)  SessionFactoryUtil.getSessionFactory().openSession().createQuery("From UsersEntity ").list();
        return users;
    }
}
