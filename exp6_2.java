import java.util.*;

class exp6_2{
	static Scanner sc = new Scanner(System.in);

	static int GCD(int a,int b){
		int min = (a<b) ? a:b;
		int max = (a>b) ? a:b;
		if(max%min == 0) return min;
		else GCD(min-1, max);
		return 1;
		
	}

	static int LCM(int a,int b){
		if(GCD(a,b)==0) return 0;
		return (a/ GCD(a,b))*b ;
		
	}
    static int m=1;
	static int exp(int a, int b){
		if(b>0) {
             m *= a;
            exp(a,b-1);
        }
		return m;
	}
    static int a=0;
    static int b=1;
    static int c=0;
	static void fibonacci(int n){
		if(n>0){
            c = a+b;
            System.out.print(c+" ");
            a=b; b=c;
            fibonacci(n-1);
        }	
	}

	static int rev = 0;

	static int reverse(int n){
	if(n!=0){
		int l = n%10;
		rev = rev*10 + l; 
		reverse(n/10);	
	}
	return rev;
	
	}

	static int sum=0, sumint=0;

	static int sumN(int n){
		if(n!=0){
			sum += n;
			sumN(n-1);
		}
		return sum;	
	}

	static int  sumInt(int n){
		if(n>0){
			sumint += n%10;
			sumInt(n/10);
		}
		return sumint;
	}
	

	public static void main(String args[]){
		System.out.println("Enter 2 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = GCD(a,b);
		System.out.println("gcd = "+gcd);
		int lcm = LCM(a,b);
		System.out.println("lcm = "+lcm);
		int exp = exp(a,b);
		System.out.println("exp = "+exp);
		System.out.println("Enter n for fibonacci number: ");
		int n = sc.nextInt();
		System.out.print("0 1 ");
		fibonacci(n-2);

		System.out.println("Enter number to reverse: ");
		int r = sc.nextInt();
		System.out.println("reverse = "+ reverse(r));

		System.out.println("Enter number for sum: ");
		int s = sc.nextInt();
		int sum = sumN(s);
		System.out.println("reverse = "+sum);
		int sumInt = sumInt(s);
		System.out.println("sum of digits = "+sumInt);

	}
}
