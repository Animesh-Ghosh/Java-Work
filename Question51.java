//program to demonstrate use of super () to give appropriate name to a thread

class DemoThread extends Thread {
	DemoThread (String str) {
		super (str);
	}
	public void run () {
		System.out.println ("Name of thread is " + this.getName ());
		System.out.println ("Thread ID: " + this.currentThread ().getId ());
	}
}

class Question51 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			DemoThread obj1 = new DemoThread ("First");
			DemoThread obj2 = new DemoThread ("Second");
			obj1.start ();
			obj2.start ();
		}
	}
}