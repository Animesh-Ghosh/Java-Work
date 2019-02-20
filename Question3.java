import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

// program to compute volume of a sphere

class Question3 {
	public static void main (String[] args) {
		float pi, radius, volume;
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter radius: ");
		radius = input.nextFloat ();
		volume = (float) ((4.0/3) * PI * pow (radius, 3));
		System.out.println ("Radius = " + radius);
		System.out.println ("Volume of sphere = " + volume);
	}
}