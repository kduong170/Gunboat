import java.util.Scanner;

public class Gunboat {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter distance to target.");
		double d = reader.nextDouble();
		System.out.println("Enter the height of the battery relative to the water line.");
		double h = reader.nextDouble();
		System.out.println("Enter the initial velocity of the shell.");
		double v = reader.nextDouble();
		
		double a = -4.9*(d/v)*(d/v);
		double b = d;
		double c = a+h;
		
		double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		double angle = Math.atan(tanTheta)*180/3.1415926536;
		System.out.println("The angle is " + angle + " degrees");
	}

}




