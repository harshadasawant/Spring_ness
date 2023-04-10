package hnd.service;

import hnd.dto.CustomerLoginDTO;
import hnd.exception.HnDBankException;
import hnd.repository.CustomerLoginRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {
    @Autowired
    private CustomerLoginRepository customerLoginRepository;
    public String authenticateCustomer(CustomerLoginDTO customerLogin)  {
        try {
            String toRet = null;
            CustomerLoginDTO customerLoginFromDao = customerLoginRepository
                    .getCustomerLoginByLoginName(customerLogin.getLoginName());
            if (customerLogin.getPassword().equals(customerLoginFromDao.getPassword())){
                toRet = "SUCCESS";
            }else{
                throw new HnDBankException("Service.WRONG_CREDENTIALS");
            }
            return toRet;
        }catch(HnDBankException exception) {
            Log LOGGER = LogFactory.getLog(this.getClass());
            LOGGER.error(exception.getMessage(),exception);
            throw exception;
        }
    }
}