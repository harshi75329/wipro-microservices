package com.wipro.java.ms.solid.Employe;

class TaxCalculator {
    public double calculateTax(Employee employee) {
        double salary = employee.getSalary();
        if (salary > 50000) {
            return salary * 0.20; // 20% tax for high salary
        } else {
            return salary * 0.10; // 10% tax for lower salary
        }
    }
}
