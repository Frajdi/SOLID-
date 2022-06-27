package l.before;

public class CEO extends Employee {

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;

        salary = baseAmount * rank;
    }

    @Override
    public void assignManager(Employee manager) {
        throw new UnsupportedOperationException("This CEO has no manager");
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}
