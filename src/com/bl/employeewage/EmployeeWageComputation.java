package com.bl.employeewage;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");
        int employeeHrs = 0, Workday = 20, employeeRate = 20, totalEmployeeWage = 0;
        int employeeWage;
        for (int day = 1; day <= Workday; day++) {
            int isEmployee = (int) Math.floor ( Math.random () * 10 ) % 3;
            switch (isEmployee) {
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
            employeeWage = employeeHrs * employeeRate;
            totalEmployeeWage += employeeWage;
            System.out.println ( "Day " + day + " Employee Wage is Rs." + employeeWage );
        }
        System.out.println ( "\nTotal Employee Wage is Rs." + totalEmployeeWage );
    }
}
