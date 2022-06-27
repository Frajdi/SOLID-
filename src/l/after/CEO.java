package l.after;

public class CEO extends Role {
    CEO() {
        super(150.0, 1.0);
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}