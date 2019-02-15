/* Demonstrate the use of wrapper class */

class wrapper {
	public static void main(String[] args) {
		//normal int variable
		int test = 34;	
		//using Integer class create a wrapper
		Integer i = new Integer(test);	
		//printing value of i
		System.out.println("Integer Object i : " + i);
		// getting value of the object i
		int i2 = i.intValue();
		System.out.println("Value of i2 : " + i2);
	}
}