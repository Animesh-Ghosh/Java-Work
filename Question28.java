import java.util.Scanner;

// program to demonstrate concept of this

class Rectangle {
    float x, y, width, height;
    float area;
    Rectangle () { this (0, 0, 10, 10); }
    Rectangle (float width, float height) { this (0, 0, width, height); }
    Rectangle (float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    float Area () { 
        area = width * height;
        return (area); }
    void display () {
        System.out.println ("Position of rectangle: (" + x + ", " + y + ")");
        System.out.println ("Area of rectangle: " + Area () + " sq. units");
    }
}

public class Question28 {
	public static void main (String args[]) {
        float xpos, ypos, width, height;
        Scanner input = new Scanner (System.in);
        System.out.println ("Rectangle1: ");
		Rectangle r1 = new Rectangle ();
        r1.display ();
        System.out.println ("Rectangle2: ");
        System.out.print ("Enter width: ");
        width = input.nextFloat ();
        System.out.print ("Enter height: ");
        height = input.nextFloat ();
        Rectangle r2 = new Rectangle (width, height);
        r2.display ();
        System.out.println ("Rectangle3: ");
        System.out.print ("Enter x-position: ");
        xpos = input.nextFloat ();
        System.out.print ("Enter y-position: ");
        ypos = input.nextFloat ();
        System.out.print ("Enter width: ");
        width = input.nextFloat ();
        System.out.print ("Enter height: ");
        height = input.nextFloat ();
        Rectangle r3 = new Rectangle (xpos, ypos, width, height);
        r3.display ();
	}
}