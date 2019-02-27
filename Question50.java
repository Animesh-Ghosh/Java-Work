/* program creating 2 threads using Runnable interface, print your name in run ()
	method of first class and "Hello Java" in run () method of second thread */

class Hello implements Runnable {
	public void run () {
		try {
			for (int i = 1; i <= 5 ; i++) {
				System.out.println ("Ma name Jeff!");
				Thread.sleep (500);
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Thread interrupted!");
		}
	}
}

class Java implements Runnable {
	public void run () {
		for (int i = 1; i <= 5 ; i++) {
			System.out.println ("Hello Java!");
		}
	}
}

class Question50 {
	public static void main (String[] args) {
		Hello obj1 = new Hello ();
		Java obj2 = new Java ();
		Thread t1 = new Thread (obj1);
		Thread t2 = new Thread (obj2);
		t1.start ();
		t2.start ();
	}
}
