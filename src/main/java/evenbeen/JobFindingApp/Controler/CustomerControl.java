package evenbeen.JobFindingApp.Controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CustomerControl {

    public ResponseEntity<String> saveCustomer(@RequestBody CustomerDto customerDto){
        String massage = coustomerService.saveCustomer(customerDto);
        return new ResponseEntity<String>(massage, HttpStatus.CREATED);
    }
}
