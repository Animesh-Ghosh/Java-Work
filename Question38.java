import java.io.*;

// program to demonstrate multiple catch statements

class Question38 {
	public static void main(String[] args) {
		FileInputStream fin;
		int k;
		try {
			fin = new FileInputStream ("File/Test2.txt");
			while ((k = fin.read ()) != -1) 
				System.out.print ((char) k);
			fin.close ();
		}
		catch (FileNotFoundException fnfe) {
			System.out.println ("File not Found!\n" + fnfe);
		}
		catch (IOException ioe) {
			System.out.println ("I/O Exception\n" + ioe);
		}
		catch (Exception e) {
			System.out.println ("Exception found!\n" + e);
		}
	}
}