// program to demonstrate run-time polymorphism

class Base {
	int data = 10;
	void display () {
		System.out.println ("Base: " + data);
	}
}

class Derived extends Base {
	int data = 20;
	void display () {
		System.out.println ("Derived: " + data);
	}
}

class Question32 {
	public static void main(String args[]) {
		Base objB = new Base ();
		Derived objD = new Derived ();
		Base ref;
		ref = objB;
		System.out.println ("Using base class' reference to access base class' display.");
		ref.display ();
		ref = objD;
		System.out.println ("Using derived class' reference to access base class' display.");
		ref.display ();
		System.out.println ("Derived class data using base class reference: " + ref.data);
	}
}