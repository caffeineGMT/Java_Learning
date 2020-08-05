// package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(50);
        System.out.println(wage);// shortcut snippet sysout
    }
}
