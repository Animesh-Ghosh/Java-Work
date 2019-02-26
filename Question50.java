import java.lang.Thread.*;

/* program creating 2 threads using Runnable interface, print your name in run ()
	method of first class and "Hello Java" in run () method of second thread */

class Hello implements Runnable {
	public void run() {
		for (int i = 1 ;i <= 5 ; i++ ) {
			System.out.println("PRAJESH");
		}
	}
}
class Question50 {
	public static void main(String[] args) {
		Hello r =new Hello();
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 5; i++ ) {
			System.out.println("Hello java");
		}
	}
}