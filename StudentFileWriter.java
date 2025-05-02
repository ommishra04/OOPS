import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("student.txt", true);

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            String rollNumber = scanner.nextLine();

            System.out.print("Enter grade: ");
            String grade = scanner.nextLine();

            String studentData = String.format("Name: %s, Roll Number: %s, Grade: %s%n", 
                                               name, rollNumber, grade);

            writer.write(studentData);
            writer.close();

            System.out.println("Student information written to student.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
