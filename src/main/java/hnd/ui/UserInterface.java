package hnd.ui;

import hnd.bean.WelcomeBean;
import hnd.config.SpringConfig;
import hnd.controller.CustomerLoginController;
import hnd.dto.CustomerLoginDTO;
import hnd.exception.HnDBankException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserInterface {
    public static final Log LOGGER = LogFactory.getLog(UserInterface.class);
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext =null;
        try{
            applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
            CustomerLoginController customerLoginController = applicationContext
                    .getBean(CustomerLoginController.class);
            CustomerLoginDTO customerLogin = new CustomerLoginDTO();
            customerLogin.setLoginName("harry");
            customerLogin.setPassword("harry123");

            customerLoginController.authenticateCustomer(customerLogin);
        }catch(HnDBankException exception){
            exception.printStackTrace();
        }
    }


}
