package evenbeen.JobFindingApp.Service;

import evenbeen.JobFindingApp.Dto.CustomerDto;
import evenbeen.JobFindingApp.Dto.CustomerUpdate;

public interface CustomerService {
    String saveCustomer(CustomerDto customerDto);

    CustomerUpdate updateCustomer(CustomerUpdate customerUpdate);
}
