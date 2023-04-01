package example2;

public class Developer implements Employee {
    private final String name;
    private final Long employeeId;
    private final String position;

    public Developer(Long employeeId, String name, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(employeeId + " " + name + " " + position);
    }
}
