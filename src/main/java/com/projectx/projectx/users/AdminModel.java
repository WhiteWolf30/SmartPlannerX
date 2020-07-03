package com.projectx.projectx.users;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
public class AdminModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "admin_model_id_seq")
    @SequenceGenerator(name = "admin_model_id_seq",sequenceName = "admin_model_id_seq",allocationSize = 1)
    Long id;

    @Column(name = "username")
    String username;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "password")
    String password;

}
