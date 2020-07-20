package com.projectx.projectx.controller;

import com.projectx.projectx.entity.Business;
import com.projectx.projectx.entity.Customer;
import com.projectx.projectx.service.BusinessService;
import com.projectx.projectx.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(@Autowired CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/alldata")
    public List<Customer> allData() {
        return  customerService.getAll();
    }

    @GetMapping("/{id}")
    public Customer findOneById(@PathVariable Long id) {
        return customerService.findOneById(id);
    }

    @PostMapping
    public Customer saveData(@RequestBody Customer customer) {
        return customerService.saveData(customer);
    }

    @PutMapping
    public Customer updateData(@RequestBody Customer customer) {
        return customerService.saveData(customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        customerService.delete(id);
        return ResponseEntity.ok("deleted");
    }

}
