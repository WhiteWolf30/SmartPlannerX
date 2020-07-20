package com.projectx.projectx.repository;

import com.projectx.projectx.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("Business")
public interface BusinessRepository extends JpaRepository<Business,Long> {

    Business findOneById(Long id);

    void deleteById(Long id);

}
