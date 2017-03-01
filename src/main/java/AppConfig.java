import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.CustomerHibernate;
import repository.CustomerHibernateImpl;
import service.CustomerService;
import service.CustomerServiceImpl;

/**
 * Created by ritesh on 3/1/17.
 */
@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        final CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerHibernate(getCustomerHibernate());

        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerHibernate getCustomerHibernate() {
        return new CustomerHibernateImpl();
    }
}
