package s.after;

public class Person {
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFistName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printUserName() {
        System.out.printf("Your username is %s %s\n", getFirstName(), getLastName());
    }
}