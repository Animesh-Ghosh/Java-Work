/* program to demonstrate the concept of abstract class 
	with constructor and final method */

abstract class Base {
	int data;
	Base () {
		data = 20;
	}
	final void outBase () {
		System.out.println ("Base class' data: " + data);
	}
}

class Derived extends Base {
	int data = 15;
	void outDerived () {
		System.out.println ("Derived class' data: " + data);
	}
}

class Question34 {
	public static void main(String args[]) {
		Base objB = new Derived ();
		Derived objD = new Derived ();
		System.out.println ("Using Base class' reference to use Base class' method.");
		objB.outBase ();
		System.out.println ("Using Derived class object to use Derived class' method.");
		objD.outDerived ();
	}
}