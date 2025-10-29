// Base class
public class Developer {
    protected String firstName;
    protected String lastName;
    protected String ssn;
    protected double monthlySalary;

    public Developer(String firstName, String lastName, String ssn, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.monthlySalary = monthlySalary;
    }

    public double calculateAnnualPayment(boolean bonus) {
        double annual = monthlySalary * 12;
        if (bonus) annual += 5000; // shared bonus for all developers
        return annual;
    }
}
