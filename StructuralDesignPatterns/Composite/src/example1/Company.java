package example1;

public class Company {
    public static void main(String[] args) {
        Employee developer1 = new Developer(100L, "Developer One", "Pro developer");
        Employee developer2 = new Developer(101L, "Developer Two", "Rookie developer");

        Directory engineering = new Directory();
        engineering.addEmployee(developer1);
        engineering.addEmployee(developer2);

        Employee manager1 = new Manager(200L, "Manager One", "SEO Manager");
        Employee manager2 = new Manager(201L, "Manager Two", "Office Manager");

        Directory accounting = new Directory();
        accounting.addEmployee(manager1);
        accounting.addEmployee(manager2);

        Directory company = new Directory();
        company.addEmployee(engineering);
        company.addEmployee(accounting);
        company.showEmployeeDetails();
    }
}
