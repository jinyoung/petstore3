package petshop.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import petshop.domain.*;

@RestController
// @RequestMapping(value="/customers")
@Transactional
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping(
        value = "customers/{id}/createAccount4",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Customer createAccount(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /customer/createAccount  called #####");
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        optionalCustomer.orElseThrow(() -> new Exception("No Entity Found"));
        Customer customer = optionalCustomer.get();
        customer.createAccount();

        customerRepository.save(customer);
        return customer;
    }

    @RequestMapping(
        value = "customers/{id}/deleteAccount",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Customer deleteAccount(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /customer/deleteAccount  called #####");
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        optionalCustomer.orElseThrow(() -> new Exception("No Entity Found"));
        Customer customer = optionalCustomer.get();
        customer.deleteAccount();

        customerRepository.save(customer);
        return customer;
    }
<<<<<<< HEAD

    @RequestMapping(
        value = "customers/{id}/createAvatar",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Customer createAvatar(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /customer/createAvatar  called #####");
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        optionalCustomer.orElseThrow(() -> new Exception("No Entity Found"));
        Customer customer = optionalCustomer.get();
        customer.createAvatar();

        customerRepository.save(customer);
        return customer;
    }

    @RequestMapping(
        value = "customers/{id}/test",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Customer test(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /customer/test  called #####");
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        optionalCustomer.orElseThrow(() -> new Exception("No Entity Found"));
        Customer customer = optionalCustomer.get();
        customer.test();

        customerRepository.save(customer);
        return customer;
    }

    @RequestMapping(
        value = "customers/{id}/estsefsf",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Customer tetsfsfd(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /customer/tetsfsfd  called #####");
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        optionalCustomer.orElseThrow(() -> new Exception("No Entity Found"));
        Customer customer = optionalCustomer.get();
        customer.tetsfsfd();

        customerRepository.save(customer);
        return customer;
    }
=======
>>>>>>> be917371c1747605ab3eeebe6637962eeeafe390
    // keep
}
