 //  program to demonstrate a single-threaded process

class Question46 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread ();
		System.out.println ("Current thread is " + t);
		System.out.println ("The name of thread is " + t.getName ());
		t.setName ("Test");
		System.out.println ("Current thread is " + t);
		System.out.println ("The name of thread is " + t.getName ());
	}
}
