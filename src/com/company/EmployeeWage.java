package com.company;

public class EmployeeWage {


    public int totalWage;
    int wagesPerHour;
    int fullDayHours;
    int partTimeHours;
    static final int IS_PART_TIME = 0;
    static final int IS_FULL_TIME = 1;
    int workingDaysperMonth;
    int workingHoursPeerMonth;
    String companyName;

    public EmployeeWage(){

    }
    public EmployeeWage(String companyName,int wagesPerHour,int fullDayHours,int partTimeHours,int workingDaysperMonth,int workingHoursPeerMonth) {

        this.companyName = companyName;
        this.wagesPerHour = wagesPerHour;
        this.fullDayHours = fullDayHours;
        this.partTimeHours = partTimeHours;
        this.workingDaysperMonth = workingDaysperMonth;
        this.workingHoursPeerMonth = workingHoursPeerMonth;
    }

    public void calculateEmployeeWage(){
        int dailyWages = 0;
        int wagesofMonth = 0;
        int workingDay = 1;
        int day = 1;
        int totalWorkingHoursOfMonth = 0;
        while (workingDay <= workingDaysperMonth && totalWorkingHoursOfMonth < workingHoursPeerMonth) {
            int attendance = (int) Math.floor(Math.random() * 10) % 3;
            switch (attendance) {
                case IS_PART_TIME:
                    System.out.println("Day " + day + " Half day");
                    dailyWages = wagesPerHour * partTimeHours;
                    System.out.println("Wages of the day: " + dailyWages);
                    wagesofMonth = dailyWages + wagesofMonth;
                    totalWorkingHoursOfMonth = totalWorkingHoursOfMonth + partTimeHours;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Day " + day + " present");
                    dailyWages = wagesPerHour * fullDayHours;
                    System.out.println("Wages of the day: " + dailyWages);
                    wagesofMonth = dailyWages + wagesofMonth;
                    totalWorkingHoursOfMonth = totalWorkingHoursOfMonth + fullDayHours;
                    break;
                default:
                    System.out.println("Day " + day + " Absent");
                    break;
            }
            day++;
            workingDay++;
        }
        System.out.println("");
        System.out.println("Company: "+companyName);
        System.out.println("Total Working Hours of the month: " + totalWorkingHoursOfMonth);
        System.out.println("Wages of the month: " + wagesofMonth);
        //System.out.println("Wages of the month: " + wagesofMonth);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Problem::");
        System.out.println();
        EmployeeWageBuilderImpl employeeWageBuilder = new EmployeeWageBuilderImpl();
        employeeWageBuilder.createWageBuilder();
    }
}
