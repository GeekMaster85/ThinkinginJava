package AccessControl;

import java.util.Arrays;

// Array creation methods that can be used without
// qualifiers, using Java SE5 static imports:
public class Range {
    // Produce a sequence [0..n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for(int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }
    // Produce a sequence [start..end)
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++)
            result[i] = start + i;
        return result;
    }
    // Produce a sequence [start..end) incrementing by step
    public static int[] range(int start, int end, int step) {
        int sz = (end - start)/step + 1;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++)
            result[i] = start + (i * step);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(range(5)));
        System.out.println(Arrays.toString(range(5, 10)));
        System.out.println(Arrays.toString(range(5, 15, 3)));
    }
}
