package hnd.service;

import hnd.dto.CustomerLoginDTO;
import hnd.exception.HnDBankException;
import org.springframework.stereotype.Component;

@Component
public interface CustomerLoginService {
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException;
}
