package ReusingClasses;

/* Inherit a new class from class Detergent. Override scrub() and add a new method
 * called sterilize().
 */

public class Sterilizer extends Detergent {
    public void scrub() { append(" Sterilizer.scrub()"); }
    public void sterilize() { append(" sterilize()"); }
    public static void main(String[] args) {
        Sterilizer x = new Sterilizer();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        System.out.println("Testing base class:");
        Detergent.main(args);
    }
}

