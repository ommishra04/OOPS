package Experiment5_q2;

public class Manager extends Employee2 {
    private String department;

    public Manager() {
        super();
        this.department = "Unknown";
    }

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}
