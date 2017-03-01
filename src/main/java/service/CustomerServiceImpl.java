package service;

import repository.CustomerHibernate;
import repository.CustomerHibernateImpl;

/**
 * Created by ritesh on 2/18/17.
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerHibernate customerHibernate;

    public CustomerServiceImpl(final CustomerHibernate customerHibernate) {
        this.customerHibernate = customerHibernate;
    }
    public void setCustomerHibernate(final CustomerHibernate customerHibernate) {
        this.customerHibernate = customerHibernate;
    }

    public void setCustomerFirstName() {
        customerHibernate.setCustomer("Ritesh");
    }

    public String findCustomer() {
        setCustomerFirstName();
        return customerHibernate.findCustomer();
    }
}
