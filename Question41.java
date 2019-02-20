// program to demonstrate use of throw keyword 

class Question41 {
	static void validate (int test) {
		if (test < 25)
			// throw an exception
			throw new ArithmeticException ("Exception Caught!");
		else
			System.out.println ("Value of test: " + test);
	}
	public static void main(String[] args) {
		validate(30);
		validate(45);
		validate(12);	//this will generate exception 
	}
}