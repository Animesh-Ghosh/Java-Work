// program to use super() to invoke base class constructor

class Base {
	int x;
	Base () {
		x = 15;
	}
	void outBase () {
		System.out.println ("Base x = " + x);
	}
}

class Derived extends Base {
	int y;
	Derived () {
		super ();
		System.out.println ("Calling base class' constructor using super().");
		y = 20;
	}
	void outDerived () { 
		outBase ();
		System.out.println ("Derived y = " + y);
	}
}

class Question30 {
	public static void main(String args[]) { 
		Derived obj = new Derived ();
		obj.outDerived ();
	}
}