import java.util.Scanner;

// program to enter marks of five subjects and compute percentage

class Question12 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		float subject1, subject2, subject3, subject4, subject5, percentage;
		System.out.println ("Enter marks of five subjects: ");
		System.out.print ("Enter marks of subject 1: ");
		subject1 = input.nextFloat ();
		System.out.print ("Enter marks of subject 2: ");
		subject2 = input.nextFloat ();
		System.out.print ("Enter marks of subject 3: ");
		subject3 = input.nextFloat ();
		System.out.print ("Enter marks of subject 4: ");
		subject4 = input.nextFloat ();
		System.out.print ("Enter marks of subject 5: ");
		subject5 = input.nextFloat ();
		percentage = (subject1 + subject2 + subject3 + subject4 + subject5)/5;
		System.out.println ("Percentage: " + percentage + "%");
		if (60 <= percentage) System.out.println ("Passed with 1st division.");
		else if (50 <= percentage && percentage < 60) System.out.println ("Passed with 2nd division.");
		else if (40 <= percentage && percentage < 50) System.out.println ("Passed with 3rd division.");
		else if (percentage < 40) System.out.println ("Failed.");
	}
}