// program to print odd numbers between 1 and 50

class Question4 {
	public static void main (String args[]) {
		System.out.println ("Odd numbers from 1 to 50: ");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print (i + " ");
			}
		}
	}
}