import java.io.*;

/* program to make use of BufferedReader to read characters 
	from the keyboard until 'q' is pressed */

class Question62  {
	public static void main(String[] args) {
		char c;
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter characters, 'q' to stop: ");
		try {
			do {
				c = (char) br.read ();
			}while (c != 'q');
		}
		catch (IOException ioe) {
			System.out.println ("I/O Exception!\n" + ioe);
		}
	}
}