import java.util.Scanner;

/* program to declare class Rectangle with data members
	length and breadth member functions Input, Output
	and CalcArea */

class Rectangle {
	float length = 10, breadth = 5;
	void Input () {
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter length: ");
		length = input.nextFloat ();
		System.out.print ("Enter breadth: ");
		breadth = input.nextFloat ();
	}
	void Output () {
		System.out.println ("Length of rectangle: " + length);
		System.out.println ("Breadth of rectangle: " + breadth);
		float area = CalcArea ();
		System.out.println ("Area of rectangle: " + area);
	}
	float CalcArea () {
		return (length * breadth);
	}
}

class Question24 {
	public static void main(String args[]) {
		Rectangle rect = new Rectangle ();
		rect.Input ();
		rect.Output ();
	}
}