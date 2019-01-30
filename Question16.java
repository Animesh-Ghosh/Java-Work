// program to demonstrate use of return

class Question16 {
	public static void main (String args[]) {
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				Demo (i);
			}
			else System.out.println ("Inside the loop.");
		}
		System.out.println ("Outside the loop.");
	}
	private static void Demo (int i) {
		System.out.println ("Returning from function on step " + i + ".");
		return;
	}
}