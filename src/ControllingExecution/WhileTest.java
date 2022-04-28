package ControllingExecution;

// Demonstrates the while loop.
public class WhileTest {
    public static boolean condition() {
        double a = Math.random();
        System.out.println(a);
        boolean result = a < 0.5;
        System.out.print(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        while(condition())
            System.out.println("Inside while");
        System.out.println("Exited while");
    }
}