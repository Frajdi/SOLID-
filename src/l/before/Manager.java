package l.before;

public class Manager extends Employee {

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;

        salary = baseAmount + (rank * 4);
    }
}
