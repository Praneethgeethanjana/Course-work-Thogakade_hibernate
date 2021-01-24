package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.FactoryConfiguration;
import lk.ijse.pos.dao.custom.ItemDAO;
import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ItemDAOimpl implements ItemDAO {
    @Override
    public boolean save(Item entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
       Session session=FactoryConfiguration.getInstance().getSession();
       Transaction transaction=session.beginTransaction();

       Item item=session.get(Item.class,s);

       session.delete(item);
       transaction.commit();
       session.close();
       return true;
    }

    @Override
    public boolean update(Item entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);
        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public Item get(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Item item = session.get(Item.class, s);

        transaction.commit();
        session.close();
        return item;
    }

    @Override
    public List<Item> getAll() throws Exception {
        return null;
    }
}
