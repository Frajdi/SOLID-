package o.after;

public class Employee extends TheGetter {
    private String email;
    private boolean isManager;
    private boolean isExecutive;

    public Employee() {
        this.isManager = false;
        this.isExecutive = false;
    }

    public Employee(String firstName, String lastName, String email) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.email = email;
        this.isManager = false;
        this.isExecutive = false;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    public boolean isExecutive() {
        return isExecutive;
    }

    public void setExecutive(boolean isExecutive) {
        this.isExecutive = isExecutive;
    }
}