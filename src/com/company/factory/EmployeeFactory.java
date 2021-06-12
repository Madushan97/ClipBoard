package com.company.factory;

public class EmployeeFactory {

    public Employee getInstance(String type, String name, int hoursWorked, double rate){
        Employee employee = null;
        if(type.equals("hourly")){
            employee = new HourlyEmployee("1" , name, hoursWorked, rate);
            System.out.println("salary of Nimal :" + employee.calcSalary());
        }
        else if(type.equals("monthly")){
            employee = new HourlyEmployee("1" , name, hoursWorked, rate);
            System.out.println("salary of kamal :" + employee.calcSalary());
        }
        else if(type.equals("daily")){
            employee = new HourlyEmployee("1" , name, hoursWorked, rate);
            System.out.println("salary of samal :" + employee.calcSalary());
        }
        else if(type.equals("contact")){
            return new ContractBasisEmployee("5", name, rate);
        }
        return employee;

    }
}
