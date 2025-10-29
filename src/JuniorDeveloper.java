public class JuniorDeveloper extends Developer {

    public JuniorDeveloper(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn, 13000);
    }

    @Override
    public double calculateAnnualPayment(boolean bonus) {
        double baseAnnual = super.calculateAnnualPayment(bonus);
        return baseAnnual + (0.01 * monthlySalary * 12); // additional 1%
    }

}
