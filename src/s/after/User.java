package s.after;

import java.util.Scanner;

public class User {
    Scanner reader = new Scanner(System.in);
    Person person = new Person();
    public Person createrPerson() {
        System.out.print("What is your first name: ");
        String firstName = reader.nextLine();
        System.out.print("What is your last name: ");
        String lastName = reader.nextLine();
        person.setFistName(firstName);
        person.setLastName(lastName);
        return person;
    }
}