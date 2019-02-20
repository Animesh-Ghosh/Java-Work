// program to demonstrate concept of aggregation

class Base {
	void func () {
		System.out.println ("Base.");
	}
}

class Derived {
	Base obj;
	void func () {
		obj = new Base ();
		System.out.println ("Using Base class object inside Derived class.");
		obj.func ();
		System.out.println ("Derived.");
	}
}

class Question33 {
	public static void main(String[] args) {
		Derived objD = new Derived ();
		objD.func ();
	}
}