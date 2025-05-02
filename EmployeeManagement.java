import java.util.ArrayList;

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("ABC", 101, 50000.0));
        employees.add(new Employee("EFG", 102, 60000.0));
        employees.add(new Employee("HIJ", 103, 55000.0));

        // Update salary of employee with ID 102
        for (Employee emp : employees) {
            if (emp.getId() == 102) {
                emp.setSalary(65000.0);
                break;
            }
        }

        // Remove employee with ID 103
        employees.removeIf(emp -> emp.getId() == 103);

        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
