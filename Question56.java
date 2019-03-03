// Write a program to demonstrate making a thread as Daemon.

public class Question56 extends Thread { 
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(" Daemon Thread is working");
	    }
		 else {
			System.out.println(" User Thread is working");
		}
	}
 public static void main(String[] args) {
	Question56 t1=new Question56();
	Question56 t2=new Question56();
	Question56 t3=new Question56();
	t1.setDaemon(true);
	t1.start();
	t2.start();
	t3.start();
 }
}