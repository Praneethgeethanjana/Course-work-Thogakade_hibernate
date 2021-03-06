package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.FactoryConfiguration;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDAOimpl implements CustomerDAO {
    @Override
    public boolean save(Customer entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer=session.get(Customer.class,s);

        session.delete(customer);

        transaction.commit();
        session.close();
        return true;

    }

    @Override
    public boolean update(Customer entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public Customer get(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, s);

        transaction.commit();
        session.close();
       return customer;
    }

    @Override
    public List<Customer> getAll() throws Exception {
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//      Query query=session.createQuery("FROM Customer");
//      List list=query.list();
//
//        transaction.commit();
//        session.close();
//        return list;
        return null;
    }
}
