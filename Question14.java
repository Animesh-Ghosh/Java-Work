// program to demonstrate use of break

class Question14 {
	public static void main (String args[]) {
		for (int i = 0; i < 10; i++) {
			if (i > 5) {
				System.out.println ("Breaking out of the loop.");
				break;
			}
			else System.out.println ("Inside the loop.");
		}
		System.out.println ("Outside the loop.");
	}
}