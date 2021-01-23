package lk.ijse.pos.bo.custom.impl;

import lk.ijse.pos.bo.custom.CustomerBO;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.impl.CustomerDAOimpl;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.entity.Customer;

import java.util.ArrayList;

public class CustomerBOimpl implements CustomerBO {

    CustomerDAOimpl customerDAO=DAOFactory.getInstance().getDao(DAOFactory.DAOType.CUSTOMER);

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception {
        return customerDAO.save(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getSalary()));


    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return customerDAO.update(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getSalary()));

    }

    @Override
    public CustomerDTO getCustomer(String id) throws Exception {
        Customer customer= customerDAO.get(id);
        return new CustomerDTO(customer.getId(),customer.getName(),customer.getAddress(),customer.getSalary());

    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
        return null;
    }
}
