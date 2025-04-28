# 📚 Assignment 03: Employee Management System using Abstraction and Polymorphism

### Objective:
To understand and demonstrate the concepts of **Abstraction** and **Polymorphism** in Java by designing an employee management system.

---

### Problem Statement:

You are tasked with building a simple system to manage employees in an organization.  
There are two types of employees:

- **Full-Time Employees** (who have a fixed monthly salary)
- **Part-Time Employees** (who are paid based on the number of hours they work)

Use **abstraction** to define a general employee structure, and use **polymorphism** to display the salary details of different types of employees.

---

### Requirements:

1. **Create an abstract class** `Employee` with:
   - Fields: `name` (String), `employeeId` (int)
   - Constructor to initialize the above fields.
   - **Abstract method**: `double calculateSalary()` (to be implemented differently by subclasses)
   - **Concrete method**: `void displayDetails()` to print employee ID, name, and salary.

2. **Create two child classes**:
   - `FullTimeEmployee`
     - Additional field: `monthlySalary` (double)
     - Implement `calculateSalary()` to return the monthly salary.
   - `PartTimeEmployee`
     - Additional fields: `hourlyWage` (double), `hoursWorked` (int)
     - Implement `calculateSalary()` to return hourly wage × hours worked.

3. **In the `AbstractionDemo2` class**:
   - Create objects of `FullTimeEmployee` and `PartTimeEmployee`.
   - Write a method `printEmployee(Employee emp)` that accepts an employee reference and displays the details using `displayDetails()`.
   - Demonstrate **polymorphism** by calling `printEmployee()` for different types of employees.

---

### Expected Output Example:

```
Employee Details:
Employee ID: 101
Name: Alice
Salary: 5000.0

Employee Details:
Employee ID: 102
Name: Bob
Salary: 1600.0
```

---
