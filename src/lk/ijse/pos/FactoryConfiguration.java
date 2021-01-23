package lk.ijse.pos;

import lk.ijse.pos.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration=new Configuration().addAnnotatedClass(Customer.class);

        sessionFactory=configuration.buildSessionFactory();


    }

    public static FactoryConfiguration getInstance(){
        return (null==factoryConfiguration) ? (factoryConfiguration=new FactoryConfiguration()) :(factoryConfiguration);

    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
