// program to demonstrate single, multi-level and heirarchichal inheritance

class A {
	void outA () {
		System.out.println ("Super-class A.");
	}
}

class B extends A {
	void outB () {
		System.out.println ("Sub-class B of super-class A.");
	}
}

class C extends B {
	void outC () {
		System.out.println ("Sub-class C of super-class B.");
	}
}

class D extends A {
	void outD () {
		System.out.println ("Sub-class D of super-class A.");
	}
}

class Question29 {
	public static void main(String[] args) {
		System.out.println ("Single-level inheritance: ");
		B objB = new B ();
		objB.outA ();
		objB.outB ();
		System.out.println ("Multi-level inheritance: ");
		C objC = new C ();
		objC.outA ();
		objC.outB ();
		objC.outC ();
		System.out.println ("Heirarchichal inheritance: ");
		D objD = new D ();
		objD.outA ();
		objD.outD ();
		objB.outA ();
		objB.outB ();
	}
}