public class EmployeeManagement {

    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Abbas", 1098, 45000);
        Employee partTimeEmployee = new PartTimeEmployee("Javed", 2065, 500, 20);

        printEmployee(fullTimeEmployee);
        printEmployee(partTimeEmployee);

    }

    static void printEmployee(Employee emp) {
        emp.displayDetails();
    }
}

abstract class Employee {
    String name;
    int employeeId;

    Employee(String n, int id) {
        this.name = n;
        this.employeeId = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee Id: " + this.employeeId);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String n, int id, double salary) {
        super(n, id);
        this.monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    PartTimeEmployee(String n, int id, double wage, int hrs) {
        super(n, id);
        this.hourlyWage = wage;
        this.hoursWorked = hrs;
    }

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}