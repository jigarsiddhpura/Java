import java.util.*;

class Rectangle{
		private int l,b;
 		Rectangle(int l,int b){
		this.l = l;
		this.b = b;
		}

		int Area(){
		return l*b;
		}
	}

class Cube{
		private int side;
 		Cube(int side){
			this.side = side;
		}

		int Volume(){
			return side*side*side;
		}
	}


public class exp8_2 {
    static Scanner sc = new Scanner(System.in);

	
		public static int size(Object obj){
			if(obj instanceof Rectangle) return ((Rectangle)obj).Area();
			else if(obj instanceof Cube) return ((Cube)obj).Volume();
			else return -1;
			
		}


	public static void main(String args[]){

            Rectangle r = new Rectangle(4,5);

            Cube c = new Cube(3);
			
System.out.println("Area of Rectangle : "+exp8_2.size(r)); 
 System.out.println("Volume of Cube : "+exp8_2.size(c)); 
 System.out.println("Other objects : "+exp8_2.size(sc));

	}

}
