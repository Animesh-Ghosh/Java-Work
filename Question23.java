import java.util.Scanner;
import java.util.Arrays;

// program to reverse an input array and display it

class Question23 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int[] data, reverse_data;
		int n;
		System.out.print ("Enter number of elements: ");
		n = input.nextInt ();
		data = new int[n];
		reverse_data = new int[n];
		System.out.println ("Enter elements in array: ");
		for (int i = 0; i < n; i++) {
			System.out.print ("Enter element: ");
			data[i] = input.nextInt ();
		}
		reverse_data = reverseArr (data);
		System.out.println ("Original array: ");
		for (int i = 0; i < n; i++) 
			System.out.print (data[i] + " ");
		System.out.println ("\nReversed array: ");
		for (int i = 0; i < n; i++) 
			System.out.print (reverse_data[i] + " ");
	}
	private static int[] reverseArr (int data[]) {
			int[] reverse_data = new int[data.length];
			for (int i = 0; i < data.length; i++) 
				reverse_data[i] = data[(data.length - i - 1)];
			return reverse_data;
	}
}