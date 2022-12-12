import java.util.*;

public class exp4_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter number of items");
        int r = sc.nextInt();
        Vector ve = new Vector(10,5);

        for(int i=0;i<r;i++){
            System.out.println("Enter your list item :");
            ve.add(sc.nextInt());
        }
        System.out.println("Vector : " + ve);     
        System.out.println("Enter element whose freq is to be known");
        int n = sc.nextInt();
        for(int i=0;i<ve.size();i++){
            if(ve.get(i).equals(n)){
                count++;
            }
        }
        System.out.println("Frequeny of " +n+ "is" +count);  
    }
}