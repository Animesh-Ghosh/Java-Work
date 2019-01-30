import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

// program to compute volume of cone

class Question2 {
	public static void main (String args[]) {
		double radius, height, volume;
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter radius of cone: ");
		radius = input.nextFloat ();
		System.out.print ("Enter height of cone: ");
		height = input.nextFloat ();
		volume = (1.0/3) * PI * pow (radius, 2) * height;
		volume = (float) volume;
		System.out.println ("Radius = " + radius);
		System.out.println ("Height = " + height);
		System.out.println ("Volume of cone = " + volume);
	}
}