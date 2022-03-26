package com.company;

import java.util.ArrayList;

public class EmployeeWageBuilderImpl implements EmployeeWageBuilder {

    static ArrayList<EmployeeWage> arrayList = new ArrayList();
    public void createWageBuilder() {
        EmployeeWage employeeWage1 = new EmployeeWage("Infosys",20,8,4,20,100);
        employeeWage1.calculateEmployeeWage();

        EmployeeWage employeeWage3 = new EmployeeWage();
        employeeWage3.calculateEmployeeWage();

        EmployeeWage employeeWage2 = new EmployeeWage("HCL",20,6,3,22,90);
        employeeWage2.calculateEmployeeWage();
    }
    public int getTotalWage(String companyName) {
        int totalWage = 0;
        for (EmployeeWage employeeWageObject : EmployeeWageBuilderImpl.arrayList) {
            if (companyName.equals(employeeWageObject.companyName)) {
                totalWage = employeeWageObject.totalWage;
            }
        }
        return totalWage;
    }
}