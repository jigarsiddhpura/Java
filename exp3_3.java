import java.util.*;

public class exp3_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();
        int count = 0;

        int nums[][] = new int[r][c+1];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter a number :");
                nums[i][j] = sc.nextInt();
                count += nums[i][j];
            }
            nums[i][c] = count;
            count = 0;
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c+1;j++){
                if(j ==c ){
                    System.out.print("| " + nums[i][j] + " ");
                }else{
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("---------");

        for(int i=0;i<c+1;i++){
            int total = 0;
            for(int j=0;j<r;j++){
                total += nums[j][i];
            }
            System.out.print(total+ " ");
        }
        
    }
}