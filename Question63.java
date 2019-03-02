import java.io.*;

/* program to make use of BufferedReader to read lines 
	from the keyboard until 'STOP' is typed */

class Question63 {
	public static void main(String[] args) {
		String str;
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter strings, 'STOP' to quit: ");
		try {
			do {
				str = br.readLine ();
			}while (!str.equals ("STOP"));
		}
		catch (IOException ioe) {
			System.out.println ("I/O Exception!\n" + ioe);
		}
	}
}