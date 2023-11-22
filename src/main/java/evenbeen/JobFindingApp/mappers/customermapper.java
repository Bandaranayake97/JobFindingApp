package evenbeen.JobFindingApp.mappers;

import evenbeen.JobFindingApp.Dto.CustomerDto;
import evenbeen.JobFindingApp.Dto.CustomerUpdate;
import evenbeen.JobFindingApp.Entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface customermapper {

    Customer customerdtoTocustomer(CustomerDto customerDto);

    Customer customerupdatedtoTocustomer(CustomerUpdate customerUpdate);

    CustomerUpdate customerTocustomerDto(Customer customer);
}
