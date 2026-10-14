package com.sunbeam.Ass2;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anushree", "Desai", 50000.0);
        Employee emp2 = new Employee("Suraj", "Desai", 65000.0);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + emp2.getYearlySalary());

        System.out.println("\nApplying a 10% raise to all employees...");
        
        double emp1NewSalary = emp1.getMonthlySalary() * 1.10;
        emp1.setMonthlySalary(emp1NewSalary);

        double emp2NewSalary = emp2.getMonthlySalary() * 1.10;
        emp2.setMonthlySalary(emp2NewSalary);

        System.out.println("\n=== Yearly Salaries After 10% Raise ===");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " New Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " New Salary: " + emp2.getYearlySalary());
    }
}

