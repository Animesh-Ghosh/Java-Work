import java.io.*;

/* program to use Character stream class to read from a text file
	and copy the content to another text file */

class Question61 {
	public static void main(String[] args) {
		FileReader source = null;
		FileWriter target = null;
		try {
			source = new FileReader ("File/Test4.txt");
			target = new FileWriter ("File/Test4_target.txt");
			int k;
			String msg = " Target file!";
			while ((k = source.read ()) != -1) {
				System.out.print ((char) k);
				target.write (k);
			}
			target.write (msg);
		}
		catch (IOException ioe) {
			System.out.println ("I/O Exception!\n" + ioe);
		}
		finally {
			try {
				source.close ();
				target.close ();
			}
			catch (IOException ioe) {
				System.out.println ("I/O Exception!\n" + ioe);
			}
		}
	}
}