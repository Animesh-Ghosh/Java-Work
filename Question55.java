/* program to demonstrate use of setPriority () method
	to set priority of a thread to 1, 10 and normal */

class threadPriority extends Thread {
	Thread t = Thread.currentThread ();
	threadPriority (String str) {
		super (str);
	}
	public void run () {
		System.out.println ("Running thread name is " + t.getName ());
		System.out.println ("Running thread priority is " + t.getPriority ());
	}
}

class Question55 {
	public static void main(String[] args) {
		threadPriority t1 = new threadPriority ("A");
		threadPriority t2 = new threadPriority ("B");
		t1.setPriority (Thread.MIN_PRIORITY);
		t2.setPriority (Thread.MAX_PRIORITY);
		t1.start ();
		t2.start ();
	}
}