package com.projectx.projectx.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "bussiness")
public class Business implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bussiness_id_seq")
    @SequenceGenerator(name = "bussiness_id_seq", sequenceName = "bussiness_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;

}
