package l.after;

public class Employee extends Role {

    Employee manager;

    public Employee() {
        super(12.50, 2.0);
    }

    Employee(double baseAmount, double rankRate) {
        super(baseAmount, rankRate);
    }

    public void assignManager(Employee manager) {
        this.manager = manager;
    }
}