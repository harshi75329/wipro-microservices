package com.wipro.java.ms.solid.Employee;

class SalaryCalculator {
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.10;
    }
}
