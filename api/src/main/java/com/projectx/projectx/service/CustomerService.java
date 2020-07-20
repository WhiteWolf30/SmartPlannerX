package com.projectx.projectx.service;

import com.projectx.projectx.entity.Customer;
import com.projectx.projectx.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
@RequiredArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public void delete(Long id){
        customerRepository.deleteById(id);
    }

    public Customer findOneById(Long id){
        return customerRepository.findOneById(id);
    }

    @Transactional
    public Customer saveData(Customer customer){
        return customerRepository.save(customer);
    }

}
