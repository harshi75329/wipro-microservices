package EmpManagementSystem;

public class EmpService {
    public void performDuties(Employee employee) {
        employee.work();
    }

    public double processSalary(Employee employee) {
        return employee.calculateSalary();
    }
}
