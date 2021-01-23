package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.entity.Customer;

import java.util.List;

public class CustomerDAOimpl implements CustomerDAO {
    @Override
    public boolean save(Customer entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(Customer entity) throws Exception {
        return false;
    }

    @Override
    public Customer get(String s) throws Exception {
        return null;
    }

    @Override
    public List<Customer> getAll() throws Exception {
        return null;
    }
}
