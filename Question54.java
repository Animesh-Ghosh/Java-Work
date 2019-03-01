// program to demonstrate use of join () method

class A extends Thread {
	public void run () {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println ("A thread " + i);
				Thread.sleep (500);
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Thread A interrupted!");
		}
	}
}

class B extends Thread {
	public void run () {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println ("B thread " + i);
				Thread.sleep (500);
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Thread B interrupted!");
		}
	}
}

class C extends Thread {
	public void run () {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println ("C thread " + i);
				Thread.sleep (500);
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Thread C interrupted!");
		}
	}
}

class Question54 {
	public static void main(String[] args) {
		A a = new A ();
		B b = new B ();
		C c = new C ();
		a.start ();
		try {
			a.join ();
		}
		catch (InterruptedException ie) {
			System.out.println ("Thread interrupted!");
		}
		b.start ();
		c.start ();
		for (int i = 0; i < 5; i++) {
			System.out.println ("Main");
			try {
				Thread.sleep (2000);
			}
			catch (InterruptedException ie) {
				System.out.println ("Main thread interrupted!");
			}
		}
	}
}