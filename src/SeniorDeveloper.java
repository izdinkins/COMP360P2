public class SeniorDeveloper extends Developer {

    public SeniorDeveloper(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn, 15000);
    }

    @Override
    public double calculateAnnualPayment(boolean bonus) {
        double baseAnnual = super.calculateAnnualPayment(bonus);
        return baseAnnual + (0.01 * monthlySalary * 12); // +1%
    }
}
