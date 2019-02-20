//  program to demonstrate creation of a single child thread

class A extends Thread {
	public void run () {
		try {
			for ( int i = 1; i <= 5; i++) {
				System.out.println (5 * i);
				Thread.sleep (500);
			}
		}
		catch (InterruptedException e) {
			System.out.println ("Caught!");
		}
	}
}

class Question47 {
	public static void main(String[] args)  {
	 	A obj1 = new A();
	 	obj1.start();
	}
}
