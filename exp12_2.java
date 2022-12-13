import java.io.*;
import java.util.*;

class MarksOutOfBoundException extends Exception {

  MarksOutOfBoundException(String err) {
    System.out.println(err);
  }
}

public class exp12_2 {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int m, m2, m3, seatNo, centerNum, choice = 1;
    String name, date;
    while (choice == 1) {
      try {
        System.out.println("Enter the Seat Number : ");
        seatNo = input.nextInt();
        String str1 = input.nextLine();
        System.out.println("Enter Name of Student : ");
        name = input.nextLine();
        System.out.println("Enter the Center Number : ");
        centerNum = input.nextInt();
        String str = input.nextLine();
        System.out.println("Enter Date : ");
        date = input.nextLine();
        System.out.println("Enter the Marks in Maths : ");
        m = input.nextInt();
        System.out.println("Enter the Marks in Chemistry : ");
        m2 = input.nextInt();
        System.out.println("Enter the Marks in Physics : ");
        m3 = input.nextInt();
        Marks(seatNo, centerNum, date, name, m, m2, m3);
      } catch (Exception e) {
        System.out.println(e);
      }
      System.out.println(
        "\nEnter your choice : \n1.Enter more Student data \n2.Exit "
      );
      choice = input.nextInt();
    }
  }

  public static void Marks(
    int seatNo,
    int centerNo,
    String date,
    String name,
    int marks,
    int marks2,
    int marks3
  ) throws MarksOutOfBoundException {
    if (marks >= 100 || marks <= 0) {
      throw new MarksOutOfBoundException(
        "Input marks of all subjects should be greater than 0 and less than 100");
    } else if (marks2 >= 100 || marks2 <= 0) {
      throw new MarksOutOfBoundException(
        "Input marks of all subjects should be greater than 0 and less than 100");
    } else if (marks3 >= 100 || marks3 <= 0) {
      throw new MarksOutOfBoundException(
        "Input marks of all subjects should be greater than 0 and less than 100");
    } else {
      System.out.println(
        "\nStudent Details :\nName : " +
        name +
        "\nSeat Number: " +
        seatNo +
        "\nCenter Number : " +
        centerNo +
        "\nDate : " +
        date
      );
      System.out.println(
        "Marks inMaths : " +
        marks +
        "\nMarks in physics : " +
        marks2 +
        "\nMarks in chemistry: " +
        marks3
      );
    }
  }
}
