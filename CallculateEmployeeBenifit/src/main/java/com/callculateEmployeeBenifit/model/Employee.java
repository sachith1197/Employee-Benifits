package com.callculateEmployeeBenifit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.callculateEmployeeBenifit.utils.ApplicationEnums;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Name;

    private ApplicationEnums.UserType role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ApplicationEnums.UserType getRole() {
        return role;
    }

    public void setRole(ApplicationEnums.UserType role) {
        this.role = role;
    }
}
