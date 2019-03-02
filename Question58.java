import java.io.*;

/* program to use Byte stream class to read from a text file 
	and display the content on the output screen */

class Question58 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream ("File/Test3.txt");
			int i;
			while ((i = fin.read ()) != -1) 
				System.out.print ((char) i);
		}
		catch (IOException ioe) {
				System.out.println ("I/O Exception!\n" + ioe);
		}
		finally {
			try {
				fin.close ();
			}
			catch (IOException ioe) {
				System.out.println ("I/O Exception!\n" + ioe);
			}
		}
	}
}