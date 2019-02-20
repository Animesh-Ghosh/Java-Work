import java.util.Scanner;

// program to compute area and perimeter of rectangle

class Question1 {
	public static void main (String[] args) {
		float length, breadth, area, peri;
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter length of rectangle: ");
		length = input.nextFloat ();
		System.out.print ("Enter breadth of rectangle: ");
		breadth = input.nextFloat ();
		area = length * breadth;
		peri = 2 * (length + breadth);
		System.out.println ("Area of rectangle = " + area);
		System.out.println ("Perimeter of rectangle = " + peri);
	}
}