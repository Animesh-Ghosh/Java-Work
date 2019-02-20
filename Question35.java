/* program to demonstrate concept of interface when 
	two interfaces have unique methods and same members */

interface Base1 {
	int data = 10;
	void disp1 ();
}

interface Base2 {
	int data = 15;
	void disp2 ();
}

class Derived implements Base1, Base2 {
	public void disp1 () {
		System.out.println ("Using Derived class to implement Base1's method.");
		System.out.println ("Base1's data: " + Base1.data);
	}
	public void disp2 () {
		System.out.println ("Using Derived class to implement Base2's method.");
		System.out.println ("Base2's data: " + Base2.data);
	}
}

class Question35 {
	public static void main(String[] args) {
		Derived obj = new Derived ();
		obj.disp1 ();
		obj.disp2 ();
	}
}