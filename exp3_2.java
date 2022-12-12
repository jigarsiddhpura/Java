import java.util.*;

public class exp3_2{
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        nums[0] = new int[1];
        nums[1] = new int[2];
        nums[2] = new int[3];
        int count = 1;
        for(int x=0;x<nums.length;x++){
            for(int y=0;y<nums[x].length;y++){
                nums[x][y] = count++ ;
            }
        }
        for(int x=0;x<nums.length;x++){
            for(int y=0;y<nums[x].length;y++){
                System.out.print(nums[x][y] + " ");
            }
            System.out.println();
        }
    }
}