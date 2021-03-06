package InitializationCleanup.java;
/*Write a method that takes a vararg String array.
Verify that you can pass either a
comma-separated list of Strings or a String[] into this method.*/
public class VarargEx19 {
    static void showString(String... args) {
        for (String s : args)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        showString("one", "two", "three", "four");
        showString("1", "2", "3", "4");
    }
}
