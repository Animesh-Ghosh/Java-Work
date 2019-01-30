import java.util.Scanner;

// program to print a given pattern based on input

class Question10 {
	public static void main (String args[]) {
		Scanner inp = new Scanner (System.in);
		System.out.print ("Enter an odd number: ");
		int n = inp.nextInt ();
		int i, j, k;
		System.out.println ("Pattern: ");
		for (i = n; i > 0; i-= 2) {
			for (j = n; j > i; j-=2) System.out.print ("  ");
			for (k = 0; k < i; k++) System.out.print ("* ");
			System.out.println ();
		}
	}
}