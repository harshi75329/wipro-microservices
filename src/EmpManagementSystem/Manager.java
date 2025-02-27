package EmpManagementSystem;

public class Manager implements Employee, ManagerInterface {
    @Override
    public void work() {
        System.out.println("Manager is managing the team.");
    }

    @Override
    public double calculateSalary() {
        return 80000;
    }

    @Override
    public void approveLeave() {
        System.out.println("Manager approved leave.");
    }

    @Override
    public void assignTask() {
        System.out.println("Manager assigned a task.");
    }
}
