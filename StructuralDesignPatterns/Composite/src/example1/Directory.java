package example1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {
    private final List<Employee> employees = new ArrayList<>();
    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
