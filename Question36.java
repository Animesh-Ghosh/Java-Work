import java.io.*;

// program to demonstrate checked exception during file handling

class Question36 {
	public static void main(String args[]) {
		FileInputStream fin;
		try {
			fin = new FileInputStream ("Files/Test1.txt");
		}
		catch (FileNotFoundException fnfe) {
			System.out.println ("File not Found!\n" + fnfe);
		}
		try {
			int k;
			while ((k = fin.read ()) != -1) 
				System.out.print ((char) k);
			fin.close ();
		}
		catch (IOException ioe) {
			System.out.println ("I/O Exception\n" + ioe);
		}
	}
}