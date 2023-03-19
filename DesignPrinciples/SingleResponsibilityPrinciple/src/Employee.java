import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    public boolean isPromotionDueThisYear() {
        return true;
    }

    public double calcIncomeTaxForCurrentYear() {
        return Double.MAX_VALUE;
    }
}
