// program to demonstrate rethrowing an exception

class Question43 {
	public static void main(String[] args) {
		int x = 10, y = 0, z;
	 	try {
	 		try {
	 			z = x / y;
	 			System.out.println ("x / y = " + z);
	 		}
	 		catch (ArithmeticException ae) {
	 			System.out.println ("Divide by Zero!");
	 			y = 1;
	 			z = x / y;
	 			System.out.println ("x = " + x + "\ty = " + y);
	 			System.out.println ("x / y = " + z);
	 			throw ae; // rethrowing the error
	 		}
	 	}
	 	catch (ArithmeticException ae) {
	 		System.out.println ("Rethrown Exception Caught!");
	 	}
	 } 
}