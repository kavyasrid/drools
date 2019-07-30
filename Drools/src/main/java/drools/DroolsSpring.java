package drools;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import drools.service.*;
/**
 * Created by kavya on 2/23/17.
 */
public class DroolsSpring {
    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ((ProductService)applicationContext.getBean("ProductServiceImpl")).runProductLogic();
    }
}
