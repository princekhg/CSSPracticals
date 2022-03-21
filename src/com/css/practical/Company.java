package com.css.practical;

import java.util.ArrayList;
import java.util.List;


public class Company implements ICompanyServiceProvider{
    String company_ID,address;
    List<String> id=new ArrayList<>();

    public Company(String company_ID, String address, List<String> id, List<Employee> emp) {
        this.company_ID = company_ID;
        this.address = address;
        this.id = id;
        this.emp = emp;
    }

    public String getCompany_ID() {
        return company_ID;
    }

    public void setCompany_ID(String company_ID) {
        this.company_ID = company_ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    List<Employee> emp=new ArrayList<>();

    @Override
    public void create() {

    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
