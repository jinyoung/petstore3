package petshop.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshop.StoreApplication;

@Entity
@Table(name = "Customer_table")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    @Embedded
    private Address address;

    @PostPersist
    public void onPostPersist() {}

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = StoreApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }

    public void createAccount() {}

    public void deleteAccount() {

        //impl
    }

    public void createAvatar() {
        //ompl
    }
}
