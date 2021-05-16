package com.altimetrik.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "employee")
    private List<Department> departments = new ArrayList<>();




    public Employee(String name){
        this.name = name;
    }

    protected Employee() {
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

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
