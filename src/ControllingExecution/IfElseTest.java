package ControllingExecution;

/* Modify the two test() methods in the previous two programs so that they take
 * two extra arguments begin and end, and so that testval is tested to see if it
 * is within the range between (and including) begin and end.
 */


public class IfElseTest {
    static int test(int testval, int begin, int end) {
        if (end < begin) {
            System.out.println("end cannot be < begin");
            return 0;
        } else if ((testval > (begin - 1)) && (testval < (end + 1)))
            return +1;
        else
            return -1;
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5, 4));
        System.out.println(test(5, 4, 10));
        System.out.println(test(5, 5, 6));
        System.out.println(test(10, 5, 7));
        System.out.println(test(5, 5, 5));
    }
}
