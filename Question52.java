// program to demonstrate use of isAlive () method

public class Question52 extends Thread {
	public void run () {
		System.out.println ("Java");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie ) {
			System.out.println ("Caught!");
		}
		System.out.println ("Java race");
	}
	public static void main (String[] args) {
		Question52 t1 = new Question52 ();
		Question52 t2 = new Question52 ();
		t1.start ();
		t2.start ();
		System.out.println (t1.isAlive ());
		System.out.println (t2.isAlive ());
	}
}
