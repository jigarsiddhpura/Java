import java.util.*;

public class largest {
    public static void main(String args[]) {
        int a = 11, b = 8, c = 18;
        if ((a > b) && (a > c))
            System.out.println("Big=" + a);
        if (b > c)
            System.out.println("Big=" + b);
        else
            System.out.println("Big=" + c);
    }
}
