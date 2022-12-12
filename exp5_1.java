import java.util.*;

class exp5_1{

	static void swap(char a,char b){
		char temp;
		temp = a;
		a = b;
		b = temp;
	}

	static boolean isMeta(String s1,String s2,int arr[]){
		int ctr=0;
		if(s1.length() != s2.length()) return false;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) !=s2.charAt(i)){
				arr[ctr]= i;
				ctr++;
			}
			
		}
		if (ctr!=2) return false;
		swap(s1.charAt(arr[0]), s1.charAt(arr[1]));
		if (s1 == s2) return true;

		return true;
	}	

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		int arr[] = new int[10];
		System.out.println("enter string1");
		s1 = sc.nextLine();
		System.out.println("enter string2");
		s2 = sc.nextLine();
		boolean meta = isMeta(s1,s2,arr);
		if(meta) System.out.println("strings are meta");
		else System.out.println("strings are not meta");

	}

}