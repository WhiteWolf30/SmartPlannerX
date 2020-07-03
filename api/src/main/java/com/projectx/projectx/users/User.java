package com.projectx.projectx.users;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class User {

    @Id
    Integer id;

    @Column
    String name;

}
