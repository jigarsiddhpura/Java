import java.util.*;

class exp5_2{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("enter string1\n");
		s1 = sc.nextLine();
		int bs=0,al=0,dig=0,ss=0,wo=0,vo=0,co=0;
		for(int i=0;i<s1.length();i++){
			char ch = s1.charAt(i);
			if(Character.isLetter(ch)){
				if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') vo++;
				else co++;
				al++;
			}
			else if(Character.isDigit(ch)) dig++;
			else if(Character.isSpace(ch)) bs++;
			else ss++;


		}
		String subStrs[] = s1.split(" ",0);
		wo = subStrs.length;
		// for array its arr.length , for string its str.length()

		System.out.println("alphabets = "+al);
		System.out.println("blank spaces = "+bs);
		System.out.println("digits = "+dig);		
		System.out.println("special sequences = "+ss);
		System.out.println("words = "+wo);
		System.out.println("vowels = "+vo);
		System.out.println("consonants = "+co);

	}

}