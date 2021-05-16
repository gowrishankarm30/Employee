package com.altimetrik.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @JsonIgnore
    @ManyToOne
    private Employee employee;

    @OneToMany(mappedBy = "department")
    private List<Project> projects = new ArrayList<>();

    public Department(String name){
        this.name = name;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
