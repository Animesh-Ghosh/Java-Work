import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

// program to compute the volume and total surface area of cone

class Question6 {
	public static void main (String args[]) {
		float radius, height, slant_height, volume, tsa;
		Scanner inp = new Scanner (System.in);
		System.out.print ("Enter radius: ");
		radius = inp.nextFloat ();
		System.out.print ("Enter height: ");
		height = inp.nextFloat ();
		slant_height = (float) (sqrt (pow (radius, 2) + pow (height, 2)));
		volume = (float) ((1.0/3) * PI * pow (radius, 2) * height);
		tsa = (float) (PI * radius * (slant_height + radius));
		System.out.println ("Volume of cone = " + volume);
		System.out.println ("Total surface area of cone = " + tsa);
	}
}