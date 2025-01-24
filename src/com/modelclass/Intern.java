package com.modelclass;

public class Intern extends Employee{
    private String universityName;

    public Intern(String name, double salary,String universityName){
        super(name,salary);
        this.universityName=universityName;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" University Name:"+universityName;
    }
}
