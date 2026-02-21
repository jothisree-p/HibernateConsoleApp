package com.water.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.water.bean.Consumer;
import com.water.util.HibernateUtil;

public class ConsumerDAO {

    public boolean insertConsumer(Consumer consumer) {

        Transaction tx = null;

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();

            session.persist(consumer);

            tx.commit();

            return true;

        } catch (Exception e) {

            if (tx != null)
                tx.rollback();

            e.printStackTrace();

            return false;
        }
    }

    public Consumer findConsumer(String id) {

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            return session.get(Consumer.class, id);
        }
    }

    public List<Consumer> viewAllConsumers() {

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            return session.createQuery("from Consumer",
                    Consumer.class).list();
        }
    }
}