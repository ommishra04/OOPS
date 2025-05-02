package Experiment6;

public class Ques3_ass6 {
    private int studentId;
    private String name;
    private char grade;

    public Ques3_ass6(int studentId, String name, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

