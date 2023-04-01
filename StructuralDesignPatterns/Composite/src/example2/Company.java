package example2;

import java.math.BigDecimal;

public class Company {
    public static void main(String[] args) {
        Employee developer1 = new Developer(100L, "Developer One", "Pro developer");
        Employee developer2 = new Developer(101L, "Developer Two", "Rookie developer");

        Manager engineeringManager = new Manager("Mike", new BigDecimal(25000L));
        engineeringManager.addEmployee(developer1);
        engineeringManager.addEmployee(developer2);

        Employee developer3 = new Developer(102L, "Developer Three", "Expert developer");

        Manager generalManager = new Manager("Mark", new BigDecimal(50000L));
        generalManager.addEmployee(developer3);
        generalManager.addEmployee(engineeringManager);

        generalManager.showEmployeeDetails();
    }
}
