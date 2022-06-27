package o.after;

public class Accounts {
    public Employee create(Applicant person) {
        Employee employee = new Employee();

        employee.setFirstName(person.getFirstName());
        employee.setLastName(person.getLastName());
        employee.setEmail(String.format("%s.%s@example.com", person.getFirstName(), person.getLastName()));

        switch (person.getTypeOfEmployee()) {
            case staff:
                break;
            case manager:
                employee.setManager(true);
                break;
            case executive:
                employee.setManager(true);
                employee.setExecutive(true);
                break;
        }

        return employee;
    }
}