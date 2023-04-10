package hnd.repository;

import hnd.dto.CustomerLoginDTO;

public interface CustomerLoginRepository {
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
