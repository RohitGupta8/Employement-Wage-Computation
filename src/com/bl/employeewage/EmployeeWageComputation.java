package com.bl.employeewage;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");
        double isEmployee = Math.floor(Math.random()*10)%2;
        int employeeHrs;
        int employeeRate = 20;
        int employeeWage;
        if (isEmployee==0){
            System.out.println("Employee is Absent");
            employeeHrs = 0;
        }else {
            System.out.println("Employee is Present");
            employeeHrs = 8;
        }
        employeeWage = employeeHrs * employeeRate;
        System.out.println("\nEmployee Wage is Rs."+ employeeWage );
    }
}
