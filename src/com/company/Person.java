package com.company;

import java.io.Serializable;

public class Person implements Serializable {

    private Job job;
    private String name;

    public Person(String name, String role, long salary){
        this.name = name;
        this.job = new Job(role, salary);
    }
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + this.job.toString();
    }
}
