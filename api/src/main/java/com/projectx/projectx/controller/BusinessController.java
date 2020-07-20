package com.projectx.projectx.controller;

import com.projectx.projectx.entity.Business;
import com.projectx.projectx.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/business")
public class BusinessController {


    private final BusinessService businessService;

    @Autowired
    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping("/alldata")
    public List<Business> allData() {
        return businessService.getAll();
    }

    @GetMapping("/{id}")
    public Business findOneById(@PathVariable Long id) {
        return businessService.findOneById(id);
    }

    @PostMapping
    public Business saveData(@RequestBody Business business) {
        return businessService.saveData(business);
    }

    @PutMapping
    public Business updateData(@RequestBody Business business) {
        return businessService.saveData(business);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        businessService.delete(id);
        return ResponseEntity.ok("deleted");
    }

}
