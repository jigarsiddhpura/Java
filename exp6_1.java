import java.util.*;

public class Area_MO {
    static Scanner sc = new Scanner(System.in);

    void area(int r) {
        System.out.println("Area of square is " + r * r);
    }

    void area(int s1, int s2) {
        System.out.println("Area of rectangle is " + s1 * s2);
    }

    public static void main(String args[]) {
        System.out.println("Enter 1 for area of rectange & 0 area of square");
        int n = sc.nextInt();
        Area_MO obj = new Area_MO();
        if (n == 1) {
            System.out.println("Enter the side1: ");
            int s1 = sc.nextInt();
            System.out.println("Enter the side2: ");
            int s2 = sc.nextInt();
            obj.area(s1, s2);
        } else {
            System.out.println("Enter the side: ");
            int r = sc.nextInt();
            obj.area(r);
        }

    }

}
