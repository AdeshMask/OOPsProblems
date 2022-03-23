package com.bridgelabz.Day9;

public class EmployeeWage {

    int wagesPerHour;
    int fullDayHours;
    int partTimeHours;
    static final int IS_PART_TIME = 0;
    static final int IS_FULL_TIME = 1;
    int workingDaysperMonth;
    int workingHoursPeerMonth;

    void empWage(int wagesPerHour, int fullDayHours, int partTimeHours, int workingDaysperMonth,int workingHoursPeerMonth){
        int dailyWages = 0;
        int wagesofMonth = 0;
        int workingDay = 1;
        int day = 1;
        int totalWorkingHoursOfMonth = 0;
        while (workingDay <= workingDaysperMonth && totalWorkingHoursOfMonth <= workingHoursPeerMonth){
            int attendance = (int) Math.floor(Math.random()*10)%3;
            switch (attendance){
                case IS_PART_TIME:
                    System.out.println("Day "+day+" Half day");
                    dailyWages = wagesPerHour * partTimeHours;
                    System.out.println("Wages of the day: "+dailyWages);
                    wagesofMonth = dailyWages + wagesofMonth;
                    totalWorkingHoursOfMonth = totalWorkingHoursOfMonth + partTimeHours;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Day "+day+" present");
                    dailyWages = wagesPerHour * fullDayHours;
                    System.out.println("Wages of the day: "+dailyWages);
                    wagesofMonth = dailyWages + wagesofMonth;
                    totalWorkingHoursOfMonth = totalWorkingHoursOfMonth + fullDayHours;
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
        System.out.println();
        System.out.println("x-x-x-x-x-x-x- Company 1 data -x-x-x-x-x-x-x");
        EmployeeWage employeeWage1 = new EmployeeWage();
        employeeWage1.empWage(20,8,4,20,100);
        System.out.println();
        System.out.println("x-x-x-x-x-x-x- Company 2 data -x-x-x-x-x-x-x");
        EmployeeWage employeeWage2 = new EmployeeWage();
        employeeWage2.empWage(24,8,4,22,120);
        System.out.println();
        System.out.println("x-x-x-x-x-x-x- Company 3 data -x-x-x-x-x-x-x");
        EmployeeWage employeeWage3 = new EmployeeWage();
        employeeWage3.empWage(18,8,4,18,80);


    }
}