package com.wipro.java.ms.solid.Employee;

class Promotion {
    public boolean isEligibleForPromotion(Employee employee) {
        return employee.getYearsOfExperience() >= 3; // Eligible if 3+ years of experience
    }
}
