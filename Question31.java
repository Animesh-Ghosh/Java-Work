/* program to use use super to invoke base class 
	overridden data member and member function */

class Base {
	int data;
	Base () {
		data = 12;
	}
	void out () {
		System.out.println ("Base data = " + data);
	}
}

class Derived extends Base {
	int data;
	Derived () {
		super ();
		data = 21;
	}
	void out () {
		System.out.println ("Calling base class' overridden member function using super.");
		super.out ();
		System.out.println ("Derived data = " + data);
		System.out.println ("Using base class' overridden data member using super and changing its value.");
		super.data = 15;
		super.out ();
	}
}

class Question31 {
	public static void main(String args[]) {
		Derived obj = new Derived ();
		obj.out ();
	}
}