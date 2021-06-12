package com.company.factory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the Employee type");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        System.out.println("Enter your Employee Name:");
        String name = scanner.next();

        System.out.println("Enter the hoursWorked:");
        int hoursWorked = scanner.nextInt();

        System.out.println("Enter the rate");
        double rate = scanner.nextDouble();

            EmployeeFactory employeeFactory = new EmployeeFactory();
            Employee employee = employeeFactory.getInstance(type, name , hoursWorked, rate);

            System.out.println("salary of th employee is : " + employee.calcSalary());
        //employee 1:


    }
}
