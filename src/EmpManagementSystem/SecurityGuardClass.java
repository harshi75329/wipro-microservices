package EmpManagementSystem;

public class SecurityGuardClass implements Employee, SecurityGuard {
    @Override
    public void work() {
        System.out.println("Security Guard is monitoring the premises.");
    }

    @Override
    public double calculateSalary() {
        return 30000;
    }

    @Override
    public void logCheckIn() {
        System.out.println("Security Guard logged check-in.");
    }
}
