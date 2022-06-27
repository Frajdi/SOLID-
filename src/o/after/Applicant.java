package o.after;

import o.after.TheGetter;

public class Applicant extends TheGetter {
    private EmployeeType typeOfEmployee;

    public Applicant(String firstName, String lastName, EmployeeType typeOfEmployee) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.typeOfEmployee = typeOfEmployee;
    }

    public EmployeeType getTypeOfEmployee() {
        return this.typeOfEmployee;
    }

    public void setTypeOfEmployee(EmployeeType typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

}