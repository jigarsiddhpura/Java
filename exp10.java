import java.util.*;

interface Sports{
	int score = 100;
	void member_score();

}


class Student{
		int roll;

		void read(int n){
			roll = n;
		}
		void display(){
			System.out.println(roll);
		}
	}

class Test extends Student{
		int sem1,sem2;

		void read1(int s1,int s2){
			sem1=s1;	
			sem2 = s2;
		}
		void display(){
			System.out.println("marks are "+sem1+" , "+sem2);
		}
	}

class Result extends Test implements Sports{
		public void member_score(){
			int total = 0;
			total = sem1+sem2+score;
			System.out.println("total marks are "+total);
}

	}




public class exp10 {
    static Scanner sc = new Scanner(System.in);

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
 Result r = new Result();
 System.out.println("Enter roll no.");
 int roll = s.nextInt();
 System.out.println("Enter sem1.");
 int sem1 = s.nextInt();
 System.out.println("Enter sem2.");
 int sem2 = s.nextInt();
 r.read(roll);
 r.read1(sem1,sem2);
 r.member_score();
	}

}
