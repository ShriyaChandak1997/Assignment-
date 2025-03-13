import java.util.ArrayList;
import java.util.List;

class Employee {
    // Attributes
    int id;
    String name;
    double salary;

    // Constructor to initialize Employee objects
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println();  // For better readability
    }
}

public class main {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "John Doe", 50000);
        Employee emp2 = new Employee(102, "Jane Smith", 60000);
        Employee emp3 = new Employee(103, "Alice Johnson", 55000);

        // Storing them in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying employee details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
