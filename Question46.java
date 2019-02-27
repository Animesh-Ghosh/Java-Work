 //  program to demonstrate a single-threaded process

class Question46 {
	public static void main (String[] args) {
		Thread t = Thread.currentThread ();
		System.out.println ("Current thread is " + t + ".");
		System.out.println ("The name of thread is " + t.getName () + ".");
		t.setName ("New Thread");
		System.out.println ("Current thread is " + t + ".");
		System.out.println ("The name of thread is " + t.getName () + ".");
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println (i);
				Thread.sleep (500);
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Main thread interrupted!");
		}
	}
}