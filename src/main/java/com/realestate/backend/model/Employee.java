package com.realestate.backend.model;

public class Employee {
        private Integer empId;
        private String empname;
        private String designation;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpname() {
        return empname;
    }

    public Employee(Integer empId, String empname, String designation) {
        this.empId = empId;
        this.empname = empname;
        this.designation = designation;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
