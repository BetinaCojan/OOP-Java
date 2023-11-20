/*
Normal implementation
 */

package lab7.practice;

import java.util.LinkedList;
import java.util.List;

public class Before_Test {

    private static class Employee {
        String name;
        float salary;
        public Employee(String name, float salary) {
            this.name = name;
            this.salary = salary;
        }
        public String getName() {
            return name;
        }
        public float getSalary() {
            return salary;
        }
        public float getTotalRevenue() {
            return salary;
        }
    }

    private static class Manager extends Employee {
        float bonus;
        public Manager(String name, float salary) {
            super(name, salary);
            bonus = 0;
        }
        public float getBonus() {
            return bonus;
        }
        public void setBonus(float bonus) {
            this.bonus = bonus;
        }
        public float getTotalRevenue() {
            return salary + bonus;
        }
    }

    public static void main(String[] args) {
        Manager manager;
        List<Employee> employees = new LinkedList<Employee>();

        employees.add(new Employee("Alice", 20));
        employees.add(manager= new Manager("Bob", 1000));
        manager.setBonus(100);

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                System.out.println(employee.getName() + "\nInitial salary: " + employee.getSalary());
                System.out.println("Bonus is: " + ((Manager) employee).getBonus());
                System.out.println("Total revenue: " + employee.getTotalRevenue() + '\n');
            } else {
                System.out.println(employee.getName() + "\nInitial salary: " + employee.getSalary());
                System.out.println("Total revenue: " + employee.getSalary() + '\n');
            }
        }
    }
}
