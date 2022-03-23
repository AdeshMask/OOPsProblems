package com.bridgelabz.Day9;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int IS_PART_TIME = 0;
    static final int IS_FULL_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int WORKING_HOURS_PER_MONTH = 100;

    void employeeWage(int dailyWages, int wagesofMonth, int workingDay, int day, int totalWorkingHoursOfMonth){
        while (workingDay <= WORKING_DAYS_PER_MONTH && totalWorkingHoursOfMonth <= WORKING_HOURS_PER_MONTH){
            int attendance = (int) Math.floor(Math.random()*10)%3;
            switch (attendance){
                case IS_PART_TIME:
                    System.out.println("Day "+day+" Half day");
                    dailyWages = WAGE_PER_HOUR * PART_TIME_HOURS;
                    System.out.println("Wages of the day: "+dailyWages);
                    wagesofMonth = dailyWages + wagesofMonth;
                    totalWorkingHoursOfMonth = totalWorkingHoursOfMonth + PART_TIME_HOURS;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Day "+day+" present");
                    dailyWages = WAGE_PER_HOUR * FULL_DAY_HOURS;
                    System.out.println("Wages of the day: "+dailyWages);
                    wagesofMonth = dailyWages + wagesofMonth;
                    totalWorkingHoursOfMonth = totalWorkingHoursOfMonth + FULL_DAY_HOURS;
                    break;
                default:
                    System.out.println("Day "+day+" Absent");
                    break;
            }
            day++;
            workingDay++;
        }
        System.out.println("Total Working Hours of the month: "+totalWorkingHoursOfMonth);
        System.out.println("Wages of the month: "+wagesofMonth);
        System.out.println("Wages of the month: "+wagesofMonth);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Problem::");
        int dailyWages = 0;
        int wagesofMonth = 0;
        int workingDay = 1;
        int day = 1;
        int totalWorkingHoursOfMonth = 0;
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.employeeWage(dailyWages,wagesofMonth,workingDay,day,totalWorkingHoursOfMonth);

    }
}