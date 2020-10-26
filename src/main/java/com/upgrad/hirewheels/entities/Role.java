package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    private int roleId;

    @Column(nullable = false,unique = true)
    private String roleName;
}
