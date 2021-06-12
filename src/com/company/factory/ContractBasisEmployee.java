package com.company.factory;

public class ContractBasisEmployee extends Employee{

    int rate;

    public ContractBasisEmployee(String id, String name, double rate){

    }

    @Override
    public double calcSalary(){
        return rate - rate*0.5;
    }


}
