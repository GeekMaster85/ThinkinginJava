package ReusingClasses;

/* Modify Exercise 5 so that A and B have constructors with arguments instead
 * of default constructors. Write a constructor for C and perform all
 * initialization within C's constructor.
 */


class A1 {
    A1(char c, int i) { System.out.println("A(char, int)");}
}

class B1 extends A1 {
    B1(String s, float f){
        super(' ', 0);
        System.out.println("B(String, float)");
    }
}

class C7 extends A1 {
    private char c;
    private int i;
    C7(char a, int j) {
        super(a, j);
        c = a;
        i = j;
    }
    B1 b = new B1("hi", 1f); // will then construct another A and then a B
    public static void main(String[] args) {
        C7 c = new C7('b', 2); // will construct an A first
        System.out.println(c.c);
        System.out.println(c.i);
    }
}

