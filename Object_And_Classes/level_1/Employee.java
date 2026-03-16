package com.gla.Object_And_Classes.level_1;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name   = name;
        this.id     = id;
        this.salary = salary;
    }

    public String getName()   { return name; }
    public int    getId()     { return id; }
    public double getSalary() { return salary; }

    public void setName(String name)     { this.name   = name; }
    public void setId(int id)            { this.id     = id; }
    public void setSalary(double salary) { this.salary = salary; }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("  Name   : " + name);
        System.out.println("  ID     : " + id);
        System.out.printf ("  Salary : Rs. %.2f%n", salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahul Sharma", 101, 75000.00);
        Employee emp2 = new Employee("Priya Mehta",  102, 92000.50);

        System.out.println("=== Employee 1 ===");
        emp1.displayDetails();

        System.out.println("\n=== Employee 2 ===");
        emp2.displayDetails();

        // Update salary using setter
        emp1.setSalary(80000.00);
        System.out.println("\n=== After Salary Update ===");
        emp1.displayDetails();
    }


}

