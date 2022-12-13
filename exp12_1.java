import java.util.Scanner;
public class exp12_1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
try {
int number = input.nextInt();
System.out.println("Number is valid " + number);
} catch (Exception e) {
System.out.println("EXCEPTION :" +e);
}
System.out.println("Program hasn't crashed");
input.close();
}
}