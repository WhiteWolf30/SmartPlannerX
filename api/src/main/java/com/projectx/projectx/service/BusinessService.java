package com.projectx.projectx.service;

import com.projectx.projectx.entity.Business;
import com.projectx.projectx.repository.BusinessRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BusinessService {

    private BusinessRepository businessRepository;

    @Autowired
    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public List<Business> getAll(){
        return businessRepository.findAll();
    }

    public void delete(Long id){
        businessRepository.deleteById(id);
    }

    public Business findOneById(Long id){
        return businessRepository.findOneById(id);
    }

    @Transactional
    public Business saveData(Business business){
        return businessRepository.save(business);
    }

}
