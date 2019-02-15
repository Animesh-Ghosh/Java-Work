/* Demonstrate a program to show use of throw keyword */

class demo{
	static void validate(int test){
		if(test < 25)
			// throw an exception
			throw new ArithmeticException ("\nException Caught !");
		else
			System.out.println("Value of test : " + test);
	}
}
class test_throw{
	public static void main(String[] args) {
		demo.validate(30);
		demo.validate(45);
		demo.validate(12);	//this will generate exception 
	}
}