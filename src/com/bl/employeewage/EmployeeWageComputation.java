package com.bl.employeewage;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");
        int isEmployee = (int) Math.floor(Math.random() * 10) % 3;
        int employeeHrs = 0;
        int employeeRate = 20;
        int employeeWage;
//        if (isEmployee==0){
//            System.out.println("Employee is Absent");
//            employeeHrs = 0;
//        }else if (isEmployee==1) {
//            System.out.println("Employee is Present");
//            employeeHrs = 8;
//        }else if (isEmployee==2) {
//            System.out.println("Employee doing part time");
//            employeeHrs = 3;
//        }
        switch (isEmployee) {
            case 0 -> {
                System.out.println("Employee is Absent");
                employeeHrs = 0;
            }
            case 1 -> {
                System.out.println("Employee is Present");
                employeeHrs = 8;
            }
            case 2 -> {
                System.out.println("Employee doing Part Time");
                employeeHrs = 3;
            }
        }
        employeeWage = employeeHrs * employeeRate;
        System.out.println("\nEmployee Wage is Rs." + employeeWage);
    }
}
