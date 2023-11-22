package evenbeen.JobFindingApp.Service.IMPL;

import evenbeen.JobFindingApp.Dto.CustomerDto;
import evenbeen.JobFindingApp.Dto.CustomerUpdate;
import evenbeen.JobFindingApp.Entity.Customer;
import evenbeen.JobFindingApp.Repo.CustomerRepo;
import evenbeen.JobFindingApp.Service.CustomerService;
import evenbeen.JobFindingApp.mappers.customermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    customermapper customermap;

    @Override
    public String saveCustomer(CustomerDto customerDto) {
        Customer customer = customermap.customerdtoTocustomer(customerDto);
        customerRepo.save(customer);
        return "success";
    }

    @Override
    public CustomerUpdate updateCustomer(CustomerUpdate customerUpdate) {

            Customer customer = customerRepo.findByUserNameEqualsAndNameEquals(customerUpdate.getUserName(),customerUpdate.getName());
            customer.setName(customerUpdate.getName());
            customer.setUserName(customerUpdate.getUserName());
            customer.setPassword(customerUpdate.getPassword());
            customer.setFirstEmail(customerUpdate.getFirstEmail());
            customer.setSecoundEmaill(customerUpdate.getSecoundEmaill());
            customer.setAddres(customerUpdate.getAddres());
            customer.setCv(customerUpdate.getCv());
            customer.setJobRole(customerUpdate.getJobRole());
            customer.setLinkin(customerUpdate.getLinkin());
            customer.setGithubLink(customerUpdate.getGithubLink());
            customerRepo.save(customer);
            CustomerUpdate customerUpdate1 = customermap.customerTocustomerDto(customer);
            return customerUpdate1;

    }
}
