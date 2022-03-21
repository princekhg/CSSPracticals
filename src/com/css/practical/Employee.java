package com.css.practical;

import java.io.Serializable;

public class Employee implements Serializable {
    protected String employeeiD;
    protected String getEmployeeName;
    protected String password;
    protected double salray;
    protected String deptNo;


    public Employee(String employeeiD, String getEmployeeName, String password, double salray, String deptNo) {
        this.employeeiD = employeeiD;
        this.getEmployeeName = getEmployeeName;
        this.password = password;
        this.salray = salray;
        this.deptNo = deptNo;
    }

    public String getEmployeeiD() {
        return employeeiD;
    }

    public void setEmployeeiD(String employeeiD) {
        this.employeeiD = employeeiD;
    }

    public String getGetEmployeeName() {
        return getEmployeeName;
    }

    public void setGetEmployeeName(String getEmployeeName) {
        this.getEmployeeName = getEmployeeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalray() {
        return salray;
    }

    public void setSalray(double salray) {
        this.salray = salray;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

}
