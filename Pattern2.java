import  java.util.*;
public class Pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        char x = 'A';
        for(int i=0;i<n;i++){
                for(int k=0;k<n-i;k++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(x);
                    x++;
                }
            System.out.println("");
        }
    }
}