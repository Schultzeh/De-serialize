package com.company;

import java.io.Serializable;

public class Job implements Serializable {
    private String role;
    private long salary;

    public Job(){
        this.role = "cop";
        this.salary = 4000;
    }
    public Job(String role, long salary){
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return " Role: " + this.getRole() + " Salary: " + this.getSalary();
    }
}