package Operators;

/* Write a method that takes two String arguments uses all the boolean
 * comparisons to compare the two Stings and print the results. For the == and
 * !=, also perform the equals() test. In main(), test your method with some
 * different String objects.
 */


import java.util.Objects;

public class StringCompare {
    static void f(boolean b) {
        System.out.println(b);
    }

    static void stringTest(String s, String t) {
        f(s == t);
        f(s != t);
        f(s.equals(t));
        f(!s.equals(t));
        f(t.equals(s));
        // f(!s);
        // f(!t);
        // s = s && t;
        // s = s || t;
        // s = ~t;
        // s = s  & t;
        // s = s | t;
        // s = s ^ t;
        // s &= t;
        // s ^= t;
        // s |= t;
    }
    public static void main(String[] args) {
        String s = "one", t = "two";
        stringTest(s, t);
    }
}

