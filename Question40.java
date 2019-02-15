// program to demonstrate concept of wrapper class

class Question40 {
	public static void main(String args[]) {
		// variables of primitive data type 
		byte test_byte = 2;
		int test_int = 34;
		float test_float = (float) 3.14;
		double test_double = 50.11446534;
		// using wrapper classes to create a wrapped object
		Byte b = new Byte (test_byte);
		Integer i = new Integer (test_int);
		Float f = new Float (test_float);
		Double d = new Double (test_double);
		System.out.println ("Printing the wrapped objects: ");
		System.out.println ("Byte Object b: " + b);
		System.out.println ("Integer Object i: " + i);
		System.out.println ("Float Object f: " + f);
		System.out.println ("Double Object d: " + d);
		// getting value of the wrapped objects
		byte b2 = b.byteValue ();
		int i2 = i.intValue();
		float f2 = f.floatValue ();
		double d2 = d.doubleValue ();
		System.out.println ("Printing values of the wrapped objects: ");
		System.out.println ("Value of b2: " + b2);
		System.out.println ("Value of i2: " + i2);
		System.out.println ("Value of f2: " + f2);
		System.out.println ("Value of d2: " + d2);
	}
}