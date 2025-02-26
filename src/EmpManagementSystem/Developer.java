package EmpManagementSystem;

public class Developer implements Employee, DeveloperInterface {
    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }

    @Override
    public double calculateSalary() {
        return 60000;
    }

    @Override
    public void writeCode() {
        System.out.println("Developer is writing code.");
    }

    @Override
    public void completeTask() {
        System.out.println("Developer completed a task.");
    }
}
