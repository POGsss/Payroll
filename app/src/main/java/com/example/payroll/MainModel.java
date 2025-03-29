package com.example.payroll;

public class MainModel {
    String employeeID;
    String name;
    String employeeType;
    int workHours;
    int workDays;
    int monthlySalary;
    Object deductions;
    int netSalary;

    public MainModel(String employeeID, String name, String employeeType, int workHours, int workDays, int monthlySalary, Object deductions, int netSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.employeeType = employeeType;
        this.workHours = workHours;
        this.workDays = workDays;
        this.monthlySalary = monthlySalary;
        this.deductions = deductions;
        this.netSalary = netSalary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Object getDeductions() {
        return deductions;
    }

    public void setDeductions(Object deductions) {
        this.deductions = deductions;
    }

    public int getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(int netSalary) {
        this.netSalary = netSalary;
    }
}
