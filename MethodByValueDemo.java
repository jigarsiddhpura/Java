import java.util.*;

public class MethodByValueDemo {

    void check(int a) {
        a = a + 5;
        System.out.println("Value of a inside method definition = " + a);
    }

    public static void main(String args[]) {
        MethodByValueDemo obj = new MethodByValueDemo();
        int a = 10;
        System.out.println("Value of a before method invocation = " + a);

        obj.check(a);
        System.out.println("Value of a after method invocation = " + a);
    }
}
