// program to demonstrate use of continue

class Question15 {
	public static void main (String args[]) {
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				System.out.println ("Continuing the loop.");
				continue;
			}
			else System.out.println ("Inside the loop.");
		}
		System.out.println ("Outside the loop.");
	}
}