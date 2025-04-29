
// Abstract class representing a generic Employee
abstract class Employee {

    protected String name;
    protected int employeeId;

    // Constructor to initialize common properties of employees
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate salary (to be implemented by subclasses)
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Class representing a Full-Time Employee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor for FullTimeEmployee
    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    // Overridden method to calculate salary for FullTimeEmployee
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Class representing a Part-Time Employee
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    // Constructor for PartTimeEmployee
    public PartTimeEmployee(String name, int employeeId, double hourlyWage, int hoursWorked) {
        super(name, employeeId);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Overridden method to calculate salary for PartTimeEmployee
    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

// Main class to demonstrate Abstraction and Polymorphism
public class AbstractionDemo2 {
    public static void main(String[] args) {
        // Employee emp = new Employee("John", 21);

        // Create instances of FullTimeEmployee and PartTimeEmployee
        Employee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 20, 80);

        // Display details using polymorphism
        printEmployee(emp1);
        printEmployee(emp2);

    }

    public static void printEmployee(Employee emp) {
        System.out.println("Employee Details:");
        emp.displayDetails();
    }
}

/*
 * Inheritance - IS A Relationship
 * Every CHILD is a PARENT
 * Every Student is a Person
 * Every Car is a Vehicle
 * Every Square is Shape
 */

/*
 * POLY - Multi
 * MORPHISM - Forms
 */