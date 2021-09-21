package com.bl.employeewage;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        double isEmployee = Math.floor(Math.random()*10)%2;
        if (isEmployee==0){
            System.out.println("Employee is Absent");
        }else {
            System.out.println("Employee is Present");
        }
    }
}
