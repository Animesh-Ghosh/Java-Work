import java.util.Scanner;

// program to compute factorial of input

class Question18 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int n, x , factorial = 1;
		System.out.print ("Enter a number: ");
		n = input.nextInt ();
		if (n == 0) System.out.println ("Factorial of 0 = 1");
		else {
			x = n;
			while (x > 0) {
				factorial *= x;
				x--;
			}
			System.out.println ("Factorial of " + n + " = " + factorial);
		}
	}
}