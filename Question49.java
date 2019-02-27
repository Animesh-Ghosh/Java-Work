// program to demonstrate use of getId () function

public class Question49 implements Runnable {
	Thread t;
	Question49 () {
		t = new Thread (this, "New Thread");
		t.setPriority (1);
		System.out.println ("Thread  = " + t);
                t.start ();
        }
        public void run () {
                System.out.println ("Name = " + t.getName ());
                System.out.println ("Id = " + t.getId ());
        }
        public static void main (String[] args) {
                new Question49 ();
        }
}
