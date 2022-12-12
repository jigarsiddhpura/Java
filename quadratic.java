import  java.util.*;
public class quadratic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a,b,c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double root1, root2;
        double det = b*b - 4*a*c ;

        if (det>0){
            root1 = (-b + Math.sqrt(det)) / (2*a);
            root2 = (-b - Math.sqrt(det)) / (2*a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        else if (det==0){
            root1 = root2 = (-b  / 2*a);

            System.out.format("root1 = root2 = %.2f", root1);
        }

        else {
            double real = -b / (2*a);
            double img = Math.sqrt(-det) / (2*a);

            System.out.format("root1 = %.2f + %.2f i", real, img);
            System.out.format("\nroot2 = %.2f - %.2f i", real, img);
        }
        
    }
}
