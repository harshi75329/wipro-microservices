package com.wipro.java.ms.solid.Employe;

class SalaryCalculator {
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.10;
    }
}
