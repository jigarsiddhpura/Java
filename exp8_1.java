import java.util.*;

public class exp8_1 {
    static Scanner sc = new Scanner(System.in);

    exp8_1(int r) {
        System.out.println("Area of square is " + r * r);
    }

    exp8_1(int s1, int s2) {
        System.out.println("Area of rectangle is " + s1 * s2);
    }

    public static void main(String args[]) {
        System.out.println("Enter 1 for area of rectange & 0 area of square");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Enter the side1: ");
            int s1 = sc.nextInt();
            System.out.println("Enter the side2: ");
            int s2 = sc.nextInt();
            exp8_1 obj1 = new exp8_1(s1,s2);
        } else {
            System.out.println("Enter the side: ");
            int r = sc.nextInt();
            exp8_1 obj2 = new exp8_1(r);
        }

    }

}
