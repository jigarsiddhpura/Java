import  java.util.*;
public class pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     if(i%2==0){
        //         for(int k=i;k>=1;k--){
        //             System.out.print(k);
        //         }
        //     }
        //     else{
        //         for(int k=1;k<=i;k++){
        //             System.out.print(k);
        //         }
        //     }
        //     System.out.println("");
        // }

        // pattern 2
        char x = 'A';
        for(int i=1;i<=n;i++){
                for(int k=0;k<n-i;k++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(x);
                    x--;
                }
            System.out.println("");
            x += 2*(char)i + 1 ;
        }
    }
}

