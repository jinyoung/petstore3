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

    private String field;

    @PostPersist
    public void onPostPersist() {}

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = StoreApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }

    public void createAccount() {
        AvatarCreated avatarCreated = new AvatarCreated(this);
        avatarCreated.publishAfterCommit();
    }

    public void deleteAccount() {

///다시시도


        CustomerDeleted customerDeleted = new CustomerDeleted(this);
        customerDeleted.publishAfterCommit();
    }

    public void createAvatar() {}
    
    public void newAPI2() {
    }

    
    public void newApi() {
        NewApIed newApIed = new NewApIed(this);
        newApIed.publishAfterCommit();
    }
}
