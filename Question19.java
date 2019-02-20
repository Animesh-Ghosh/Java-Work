import java.util.Scanner;

// program to print input number of terms of Fibonacci series

class Question19 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int terms;
		System.out.print ("Enter number of terms: ");
		terms = input.nextInt ();
		if (terms == 1) {
			System.out.println ("Fibonacci series upto 1 term: ");
			System.out.print ("0 ");
		}
		else if (terms == 2) {
			System.out.println ("Fibonacci series upto 2 terms: ");
			System.out.print ("0 1 ");
		}
		else if (terms > 2) {
			System.out.println ("Fibonacci series upto " + terms + " terms: ");
			int t = 2, f0 = 0, f1 = 1, f2;
			System.out.print ("0 1 ");
			while (t < terms) {
				f2 = f0 + f1;
				System.out.print (f2 + " ");
				f0 = f1;
				f1 = f2;
				t++;
			}
		}
	}
}