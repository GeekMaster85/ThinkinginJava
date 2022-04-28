package ReusingClasses;

/* Create two classes, X and Y, with default constructors (empty argument
 * lists) that announce themselves. Inherit a new class called Z from X, and
 * create a member of class Y inside Z. Do not create a constructor for Z. Create
 * an object of class Z and observe the results.
 */

class X { X(){ System.out.println("X()");} }

class Y extends X { Y(){ System.out.println("Y()");} }

class Z extends X { 
    Y y = new Y(); // will then construct another X and then a Y
    public static void main(String[] args) {
        Z z = new Z(); // will construct an X first
    }
}
