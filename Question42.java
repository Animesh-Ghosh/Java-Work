import java.io.*;

// program to demonstrate exception propagation

class PropagationDemo {
	void show () throws IOException {
		throw new IOException ();
	}
	void display () throws IOException {
		show ();
	}
	void print () {
		try {
			display ();
		}
		catch (Exception e) {
			System.out.println ("Exception Caught!");
		}
	}
}

class Question42 {
	public static void main(String args[]) {
		PropagationDemo p = new PropagationDemo ();
		p.print ();
	}
}