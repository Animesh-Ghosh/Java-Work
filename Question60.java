import java.io.*;

/* program to use Character stream class to read from a text file 
	and display the content on the output screen */

class Question60 {
	public static void main(String[] args) {
		FileReader source = null;
		try {
			source = new FileReader ("File/Test4.txt");
			int k;
			while ((k = source.read ()) != -1) 
				System.out.print ((char) k);
		}
		catch (IOException ioe) {
				System.out.println ("I/O Exception!\n" + ioe);
		}
		finally {
			try {
				source.close ();
			}
			catch (IOException ioe) {
				System.out.println ("I/O Exception!\n" + ioe);
			}
		}
	}
}