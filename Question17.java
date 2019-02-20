import java.util.Scanner;

// program to check if input number is palindrome

class Question17 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int num, x, digit, rev = 0;
		System.out.print ("Enter a number: ");
		num = input.nextInt ();
		x = num;
		while (x > 0) {
			digit = x % 10;
			rev = rev * 10 + digit;
			x /= 10;
		}
		if (rev == num) System.out.println (num + " is a palindrome.");
		else System.out.println (num + " is not a palindrome.");
	}
}