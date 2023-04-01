package example2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {
    private final List<Employee> employees = new ArrayList<>();
    private final String name;
    private final BigDecimal salary;

    public Manager(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("------");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("------");

        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }

    public Employee getChild(int i) {
        return employees.get(i);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
