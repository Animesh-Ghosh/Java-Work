import java.util.Scanner;

// program to test primality of a number

class Question7 {
	private static boolean prime (int n) {
		if (n <= 1) return false;
		else if(n <= 3) return true;
		else if(n % 2 == 0 || n % 3 == 0) return false;
		int i = 5;
		while (i * i <= n) {
			if(n % i == 0 || n % (i + 2) == 0) return false;
			i += 6;
		}
		return true;
	}
	public static void main (String args[]) {
		int n;
		Scanner inp = new Scanner (System.in);
		System.out.print ("Enter a number to check if it's Prime: ");
		n = inp.nextInt (); // example input 479001599
		if (prime (n)) System.out.println (n + " is Prime.");
		else System.out.println (n + " is not Prime.");
	}
}