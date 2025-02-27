package com.wipro.java.ms.solid.Employee;

public class SRPEmployeeExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 60000, 5);
        
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        TaxCalculator taxCalculator = new TaxCalculator();
        Promotion promotionService = new Promotion();
        EmployeeReport reportGenerator = new EmployeeReport();
        
        double bonus = salaryCalculator.calculateBonus(emp);
        double tax = taxCalculator.calculateTax(emp);
        boolean isEligibleForPromotion = promotionService.isEligibleForPromotion(emp);
        
        reportGenerator.generateReport(emp, bonus, tax, isEligibleForPromotion);
    }
}
