import java.io.*;

/* a program to use Byte stream class to read from a text file 
	and copy the content to another text file */

class Question59 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream ("File/Test3.txt");
			fout = new FileOutputStream ("File/Test3_target.txt");
			int k;
			String msg = " Target file!";
			while ((k = fin.read ()) != -1) {
				System.out.print ((char) k);
				fout.write (k);
			}
			fout.write (msg.getBytes ());
		}
		catch (IOException ioe) {
			System.out.println ("I/O Exception!\n" + ioe);
		}
		finally {
			try {
				fin.close ();
				fout.close ();
			}
			catch (IOException ioe) {
				System.out.println ("I/O Exception!\n" + ioe);
			}
		}
	}
}