import java.util.*;

public class input {
    public static void main(String args[]) {
        int ctr = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        String strint = Integer.toString(num);
        for (int i=0;i<strint.length();i++){
            ctr += 1;
        }
        System.out.println("Length of number is "+ctr);
    }
}
