import java.util.Scanner;

// program to print times table of an input

class Question8 {
	public static void main (String args[]) {
		Scanner inp = new Scanner (System.in);
		System.out.print ("Enter a number: ");
		int n = inp.nextInt ();
		int mul;
		System.out.println ("Times table of " + n + ": ");
		for (int i = 1; i <= n; i++) {
			mul = n * i;
			System.out.println (n + " x " + i + " = " + mul);
		}
	}
}