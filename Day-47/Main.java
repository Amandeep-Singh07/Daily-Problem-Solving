// Problem Statement



// In a company, each manager has a unique employee ID and a monthly salary. You are required to design a program that will calculate and display a manager's annual(12 months) salary based on the user's input details. 



// Implement the solution using a single inheritance approach.



// Employee: The base class with attributes name and employeeID.

// Manager: The derived class inherits from the employee, with an additional attribute salary.

// Input format :
// The input consists of a manager's name (string), employee ID (int) and monthly salary (double) on each line.

// Output format :
// The output prints the manager's name and the calculated annual salary formatted to two decimal places.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 10,000.0 ≤ monthly salary ≤ 2,00,000.0

// Sample test cases :
// Input 1 :
// Davis
// 234
// 28750.75
// Output 1 :
// Name: Davis
// Annual Salary: Rs. 345009.00
// Input 2 :
// Ramya
// 907
// 37500.25
// Output 2 :
// Name: Ramya
// Annual Salary: Rs. 450003.00

import java.util.Scanner;

// Base class representing a general Employee
class Employee {
    // Currently, this class is empty but can be extended in the future
}

// Subclass representing a Manager, which extends Employee
class Manager extends Employee {
    String name; // Manager's name
    int employeeID; // Unique Employee ID
    double salary; // Monthly salary of the manager

    // Constructor to initialize the manager's details
    Manager(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to calculate the annual salary (monthly salary * 12)
    public double calculateAnnualSalary() {
        return 12 * salary;
    }
}

// Main class to execute the program
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for Manager details
        String name = scanner.nextLine(); // Input: Manager's name
        int employeeID = scanner.nextInt(); // Input: Manager's employee ID
        double salary = scanner.nextDouble(); // Input: Manager's monthly salary

        // Creating a Manager object with user input values
        Manager manager = new Manager(name, employeeID, salary);

        // Displaying Manager details
        System.out.println("Name: " + manager.name);
        System.out.printf("Annual Salary: Rs. %.2f\n", manager.calculateAnnualSalary());

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
