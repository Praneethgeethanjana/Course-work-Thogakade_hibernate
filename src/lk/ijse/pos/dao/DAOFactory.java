package lk.ijse.pos.dao;

import lk.ijse.pos.dao.custom.impl.CustomerDAOimpl;
import lk.ijse.pos.dao.custom.impl.ItemDAOimpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return (null == daoFactory) ? (daoFactory = new DAOFactory()) : (daoFactory);
    }

    public enum DAOType {
        CUSTOMER,ITEM
    }

    public <T extends SuperDAO> T getDao(DAOType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerDAOimpl();
            case ITEM:
                return (T) new ItemDAOimpl();
            default:

                return null;
        }
    }
}


