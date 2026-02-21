package com.water.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.water.bean.Bill;
import com.water.util.HibernateUtil;

public class BillDAO {

    public boolean recordBill(Bill bill) {

        Transaction tx = null;

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();

            session.persist(bill);

            tx.commit();

            return true;
        }
        catch(Exception e){

            if(tx!=null) tx.rollback();

            e.printStackTrace();

            return false;
        }
    }

    public Bill findBill(int id){

        try(Session session =
                HibernateUtil.getSessionFactory().openSession()){

            return session.get(Bill.class,id);
        }
    }

    public boolean updateBillStatus(int id,String status){

        Transaction tx=null;

        try(Session session =
                HibernateUtil.getSessionFactory().openSession()){

            tx=session.beginTransaction();

            Bill bill=session.get(Bill.class,id);

            bill.setStatus(status);

            session.merge(bill);

            tx.commit();

            return true;
        }
        catch(Exception e){

            if(tx!=null) tx.rollback();

            return false;
        }
    }
}