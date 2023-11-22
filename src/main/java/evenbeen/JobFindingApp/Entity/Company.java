package evenbeen.JobFindingApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company {
    @Id
    private Integer companyId;
    private String companyName;
    private String campanyAddres;
    private boolean Acctive;


}
