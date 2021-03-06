package InitializationCleanup.java;
// Calling constructors with "this"

public class Flower {
    int petalCount;
    String s;

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= "
                + petalCount);
    }

    Flower(String s, int petals) {
        this(petals);
//! this(s); // Can’t call two!
        this.s = s; // Another use of "this"
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
//! this(11); // Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
