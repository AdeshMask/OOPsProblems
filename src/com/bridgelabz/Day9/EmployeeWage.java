package com.bridgelabz.Day9;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Problem::");
        int dailyWages = 0;
        int attendance = (int) Math.floor(Math.random()*10)%3;
        if (attendance == 0)
            System.out.println("Emloyee is absent");
        else if (attendance == 1) {
            System.out.println("Employee is present");
            dailyWages = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Daily Wages of Employee: "+dailyWages);
        }
        else {
            System.out.println("Employee is present for the Half day");
        }
    }
}
