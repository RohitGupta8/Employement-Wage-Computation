package com.bl.employeewage;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");
        
        int employeeHrs, employeeRate = 20, totalEmployeeWage = 0, totalEmployeeHrs = 0, totalWorkDay = 0;

        while (totalEmployeeHrs <= 100 && totalWorkDay < 20) {
            int employee = (int) Math.floor ( Math.random () * 10 ) % 3;
            totalWorkDay++;
            switch (employee) {
                case 0 -> {
                    System.out.println ( "Employee is Absent" );
                    employeeHrs = 0;
                }
                case 1 -> {
                    System.out.println ( "Employee is Present" );
                    employeeHrs = 8;
                }
                default -> {
                    System.out.println ( "Employee doing Part Time" );
                    employeeHrs = 3;
                }
            }
            totalEmployeeHrs = totalEmployeeHrs + employeeHrs;
            System.out.println ( "Day " + totalWorkDay + " Employee Hours: " + employeeHrs );
        }
        totalEmployeeWage = totalEmployeeHrs * employeeRate;
        System.out.println ( "Total Working Hours: " + totalEmployeeHrs );
        System.out.println ( "Total Employee wage for a Month Rs. " + totalEmployeeWage );
    }
}
