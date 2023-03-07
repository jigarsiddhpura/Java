import java.util.*;

public class exp3_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 4;
        int ctr = 0;
        int num, nums[], digits[];
        nums = new int[size*size];
        digits = new int[size];
        System.out.println("enter n: ");
        num = sc.nextInt();
        for(int i=0;i<size;i++){
            digits[i] = (num / (int)Math.pow(10,size-i-1))%10;
        }
        for(int i=0;i<digits.length;i++){
            if(digits[i] > 0){
                for(int j=0;j<digits.length;j++){
                    if(digits[i]!=digits[j] ){
                        nums[ctr] = digits[i]*10 + digits[j];
                        ctr++ ;
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(nums));

        for(int i=0;i<nums.length;i++){
                for(int j=i;j<nums.length;j++){
                    if(nums[i] - nums[j] < 10 ){
                        if(nums[i]*nums[j] == num){
                            System.out.println("Number is vampire");
                            System.exit(0);
                        }
                    }
            }
        }
        System.out.println("Number is not vampire");
    }
}