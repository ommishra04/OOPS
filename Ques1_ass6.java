package Experiment6;

public class Ques1_ass6 {
    private String name;
    private int id;
    private double salary;

    public Ques1_ass6(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

