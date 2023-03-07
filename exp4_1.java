import java.util.*;

public class exp4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items");
        int r = sc.nextInt();
        Vector ve = new Vector(4,5);

        for(int i=0;i<r;i++){
            System.out.println("Enter your list item :");
            String s = sc.nextLine();
            ve.add(s);
        }
        System.out.println("Vector : " + ve);
        ve.add(2,"jigar");
        System.out.println("Vector : " + ve);
        ve.removeElementAt(3);
        v.remove("jigar");
        System.out.println("Vector : " + ve);     
        
    }
}