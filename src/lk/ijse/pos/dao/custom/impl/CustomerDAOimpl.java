package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.FactoryConfiguration;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDAOimpl implements CustomerDAO {
    @Override
    public boolean save(Customer entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;

    }

    @Override
    public boolean update(Customer entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        return false;
    }

    @Override
    public Customer get(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, s);

        transaction.commit();
       return customer;
    }

    @Override
    public List<Customer> getAll() throws Exception {
        return null;
    }
}
