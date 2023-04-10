package hnd.controller;

import hnd.dto.CustomerLoginDTO;
import hnd.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller(value="CustomerLoginController")
public class CustomerLoginController {
    @Autowired
    private CustomerLoginService customerLoginService;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws Exception {
        String result = customerLoginService.authenticateCustomer(customerLogin);
        System.out.println("result ====="+result);
        return result;
    }
}
