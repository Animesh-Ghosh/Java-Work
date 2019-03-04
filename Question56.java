// program to demonstrate making a thread as Daemon

public class Question56 extends Thread { 
	public void run () {
		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println (i);
				Thread.sleep (500);
				if (Thread.currentThread ().isDaemon ())
					System.out.println ("Daemon Thread is working.");
				else 
					System.out.println("User Thread is working.");
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Thread interrupted!.\n" + ie);
		}
	}
 	public static void main(String[] args) {
		Question56 t1 = new Question56 ();
		Question56 t2 = new Question56 ();
		Question56 t3 = new Question56 ();
		t1.setDaemon (true);
		t1.start ();
		t2.start ();
		t3.start ();
 	}
}
