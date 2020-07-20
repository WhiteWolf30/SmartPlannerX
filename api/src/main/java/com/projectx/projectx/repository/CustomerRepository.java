package com.projectx.projectx.repository;

import com.projectx.projectx.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("Customer")
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findOneById(Long id);

    void deleteById(Long id);

}
