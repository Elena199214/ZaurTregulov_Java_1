package HomeWork6;

import HomeWork7.Employee;

import HomeWork7.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov");
        Employee emp2 = new Employee("Smirnov");
       // Employee emp3 = new Employee(40000.0);
        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();

        //System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);
    }
}
