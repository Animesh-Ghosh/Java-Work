// program to demonstrate user-defined exception

class MyException extends Exception {
	int data;
	MyException (int a) {
		data = a;
	}
	public String toString () {
		return "MyException " + data;
	}
}

class Question44 {
	static void compute (int a) throws MyException {
		System.out.println ("Computing " + a);
		if (a > 10) throw new MyException (a);
		else System.out.println ("No exception thrown.");
	}
	public static void main(String[] args) {
		try {
			compute (1);
			compute (25);
		}
		catch (MyException me) {
			System.out.println ("MyException Caught!\n" + me);
		}
	}
}