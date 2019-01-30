import java.util.Scanner;

/* program to enter marks of N students and compute sum and average of marks
	and to find the largest and smallest marks entered */

class Question20 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int n;
		float[] marks;
		float sum, avg, largest, smallest;
		System.out.print ("Enter number of students: ");
		n = input.nextInt ();
		marks = new float[n];
		System.out.print ("Enter marks of student 1: ");
		marks[0] = input.nextFloat ();
		largest = marks[0];
		smallest = marks[0];
		sum = marks[0];
		for (int i = 1; i < n; i++) {
			System.out.print ("Enter marks of student " + (i + 1) + ": ");
			marks[i] = input.nextFloat ();
			if (marks[i] > largest) largest = marks[i];
			if (marks[i] < smallest) smallest = marks[i];
			sum += marks[i];
		}
		avg = sum / n;
		System.out.println ("Sum of marks = " + sum);
		System.out.println ("Average of marks = " + avg);
		System.out.println ("Maximum marks = " + largest);
		System.out.println ("Minimum marks = " + smallest);
	}
}