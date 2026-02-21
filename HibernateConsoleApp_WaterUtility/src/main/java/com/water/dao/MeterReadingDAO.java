package com.water.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.water.bean.MeterReading;
import com.water.util.HibernateUtil;

public class MeterReadingDAO {

    public boolean recordReading(MeterReading reading){

        Transaction tx=null;

        try(Session session =
                HibernateUtil.getSessionFactory().openSession()){

            tx=session.beginTransaction();

            session.persist(reading);

            tx.commit();

            return true;
        }
        catch(Exception e){

            if(tx!=null) tx.rollback();

            return false;
        }
    }

    public MeterReading findLatestReading(String consumerID){

        try(Session session =
                HibernateUtil.getSessionFactory().openSession()){

            List<MeterReading> list=session.createQuery(
            "from MeterReading where consumerID=:id order by readingDate desc",
            MeterReading.class)
            .setParameter("id",consumerID)
            .setMaxResults(1)
            .list();

            return list.isEmpty()?null:list.get(0);
        }
    }
}