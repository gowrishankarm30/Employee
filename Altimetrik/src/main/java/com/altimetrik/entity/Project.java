package com.altimetrik.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
public class Project {

    @Id
    private int id;

    private String name;

    @JsonIgnore
    @ManyToOne
    private Department department;





    public Project(String name){
        this.name = name;
    }

    protected Project() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
