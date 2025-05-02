package Experiment5_q2;

public class Employee2 {
    private String name;
    private int empid;
    private double salary;

    public Employee2() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee2(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * percentage / 100;
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

