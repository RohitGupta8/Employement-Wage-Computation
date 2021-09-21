package com.bl.employeewage;

public class EmployeeWageComputation {
    public static int employeeHrs, totalEmployeeWage = 0, totalEmployeeHrs = 0, totalWorkDay = 0;

    public static void computeEmployeeWage (String company,int employeeRate,int number_of_working_day,int maxHrs) {
        while ( totalWorkDay < number_of_working_day) {
            int isEmployee = (int) Math.floor ( Math.random () * 10 ) % 3;
            totalWorkDay++;
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
            totalEmployeeHrs = totalEmployeeHrs + employeeHrs;
            System.out.println ( "Day " + totalWorkDay + " Employee Hours: " + employeeHrs );
        }
        totalEmployeeWage = totalEmployeeHrs * employeeRate;
        System.out.println ( "Total Working Hours: " + totalEmployeeHrs );
        System.out.println ( "Total Employee wage of "+company+" for "+number_of_working_day+" days  Rs. " + totalEmployeeWage );

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");
        computeEmployeeWage("Reliance",200,30,9);
        computeEmployeeWage("DMart",180,30,10);
    }
}
