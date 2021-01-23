package lk.ijse.pos.bo.custom.impl;

import lk.ijse.pos.bo.custom.CustomerBO;
import lk.ijse.pos.dto.CustomerDTO;

import java.util.ArrayList;

public class CustomerBOimpl implements CustomerBO {
    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public CustomerDTO getCustomer(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
        return null;
    }
}
