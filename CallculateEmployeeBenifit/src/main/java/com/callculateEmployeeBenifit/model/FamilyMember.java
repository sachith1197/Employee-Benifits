package com.callculateEmployeeBenifit.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.callculateEmployeeBenifit.utils.ApplicationEnums;

@Entity
public class FamilyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private String name;
    private ApplicationEnums.DependentType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationEnums.DependentType getType() {
        return type;
    }

    public void setType(ApplicationEnums.DependentType type) {
        this.type = type;
    }
}
