package Experiment5_q2;

import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
        System.out.print("Enter the number of employees to register: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        Employee2[] employees = new Employee2[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Employee ID: ");
            int empid = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Is this employee a manager? (yes/no): ");
            String isManager = scanner.nextLine();

            if (isManager.equalsIgnoreCase("yes")) {
                System.out.print("Department: ");
                String department = scanner.nextLine();
                employees[i] = new Manager(name, empid, salary, department);
            } else {
                employees[i] = new Employee2(name, empid, salary);
            }
        }

        System.out.println("\nEmployee Details:");
        for (Employee2 employee : employees) {
            employee.displayEmployeeInfo();
            System.out.println();
        }

        scanner.close();
    }
}

