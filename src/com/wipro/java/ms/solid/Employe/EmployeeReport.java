package com.wipro.java.ms.solid.Employe;

class EmployeeReport {
    public void generateReport(Employee employee, double bonus, double tax, boolean promotionEligibility) {
        System.out.println("========== Employee Report ==========");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Years of Experience: " + employee.getYearsOfExperience());
        System.out.println("Bonus: $" + bonus);
        System.out.println("Tax Deducted: $" + tax);
        System.out.println("Eligible for Promotion: " + (promotionEligibility ? "Yes" : "No"));
        System.out.println("=====================================");
    }
}
