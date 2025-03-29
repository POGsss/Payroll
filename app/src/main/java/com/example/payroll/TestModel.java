package com.example.payroll;

public class TestModel {
    String employeeID;
    String name;
    String employeeType;

    public TestModel(String employeeID, String name, String employeeType) {
        this.employeeID = employeeID;
        this.name = name;
        this.employeeType = employeeType;
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
}
