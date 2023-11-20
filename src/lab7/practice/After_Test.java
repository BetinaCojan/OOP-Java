/*
Visitor Design Pattern implementation
 */

package lab7.practice;
import java.util.LinkedList;
import java.util.List;

interface Visitor {
    public void visit(Employee employee);
    public void visit(Manager manager);
}
interface Visitable {
    public void accept(Visitor v);
}
class Employee implements Visitable {
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
    public void accept(Visitor v) {
        v.visit(this);
    }
}
class Manager extends Employee {
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
    public void accept(Visitor v) {
        v.visit(this);
    }
}
class RevenueVisitor implements Visitor {
    public void visit(Employee employee) {
        System.out.println(employee.getName() + " " + employee.getSalary());
    }
    public void visit(Manager manager) {
        System.out.println(manager.getName() + " " + (manager.getSalary() + manager.getBonus()));
    }
}
public class After_Test {
    public static void main(String[] args) {
        Manager manager;
        List<Employee> employees = new LinkedList<Employee>();
        employees.add(new Employee("Alice", 20));
        employees.add(manager= new Manager("Bob", 1000));
        manager.setBonus(100);

        Visitor v = new RevenueVisitor();
        for (Employee e : employees)
            e.accept(v);
    }
}
