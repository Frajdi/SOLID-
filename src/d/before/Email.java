package d.before;

public class Email {
    public void sendEmail(Person person, String message) {
        System.out.println(String.format("Simulating sending an email to %s", person.email));
    }
}
