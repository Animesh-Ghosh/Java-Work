import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/* program to demonstrate use of method overloading 
	to calculate area of square, rectangle, triangle */

class Question26 {
	private static float CalcArea (float side) {
		return ((float) (pow (side, 2)));
	}
	private static float CalcArea (float length, float breadth) {
		return (length * breadth);
	}
	private static float CalcArea (float side1, float side2, float side3) {
		float semiPerimeter = (float) ((side1 + side2 + side3)/2.0);
		float area = semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3);
		return ((float) (sqrt (area)));
	}
	public static void main(String args[]) {
		float x, y, z, area;
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter side of square: ");
		x = input.nextFloat ();
		area = CalcArea (x);
		System.out.println ("Area of square with side " + x + " = " + area);
		System.out.print ("Enter length of rectangle: ");
		x = input.nextFloat ();
		System.out.print ("Enter breadth of rectangle: ");
		y = input.nextFloat ();
		area = CalcArea (x, y);
		System.out.println ("Area of rectangle with dimensions " + x + " X " + y + " = " + area);
		System.out.print ("Enter first side of triangle: ");
		x = input.nextFloat ();
		System.out.print ("Enter second side of triangle: ");
		y = input.nextFloat ();
		System.out.print ("Enter third side of triangle: ");
		z = input.nextFloat ();
		area = CalcArea (x, y, z);
		System.out.println ("Area of triangle with sides " + x + ", " + y + ", " + z + " = " + area);
	}
}