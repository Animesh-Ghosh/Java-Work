// program to demonstrate garbage collector

class GarbageC {
	public void finalize () {
		System.out.println ("Garbage Collector invoked.");
	}
}

class Question25 {
	public static void main(String args[]) {
		GarbageC obj = new GarbageC ();
		String string = new String ("ABC");
		System.gc ();
		System.out.println ("Dereferencing GarbageC object.");
		obj = null;
		System.gc (); 
		/* finalize () invoked whenever CPU got time cuz low-priority
			that's why output might be inconsistent */
		System.out.println ("Dereferencing String object.");
		string = null;
		System.gc ();
	}
}