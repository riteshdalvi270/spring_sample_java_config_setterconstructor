import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;
import service.CustomerServiceImpl;

/**
 * Created by ritesh on 2/18/17.
 */
public class Application {

    public static void main(String args[]) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        final CustomerService customerService = context.getBean("customerService",CustomerService.class);

        System.out.print("FirstName:"+ customerService.findCustomer());
    }
}
