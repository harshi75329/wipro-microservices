package EmpManagementSystem;

public class Main {
    public static void main(String[] args) {
        EmpService employeeService = new EmpService();

        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee securityGuard = new SecurityGuardClass();

        // Perform Work
        System.out.println("Work Duties:");
        employeeService.performDuties(manager);
        employeeService.performDuties(developer);
        employeeService.performDuties(securityGuard);

        // Process Salary
        System.out.println("\nSalaries:");
        System.out.println("Manager Salary: " + employeeService.processSalary(manager));
        System.out.println("Developer Salary: " + employeeService.processSalary(developer));
        System.out.println("Security Guard Salary: " + employeeService.processSalary(securityGuard));
    }
}
