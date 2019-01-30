import java.util.Scanner;

// program to input elements in array and search for presence of an element

class Question22 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int[] Arr;
		int n, element;
		System.out.print ("Enter number of elements: ");
		n = input.nextInt ();
		Arr = new int[n];
		System.out.println ("Enter elements in array: ");
		for (int i = 0; i < n; i++) {
			System.out.print ("Enter element: ");
			Arr[i] = input.nextInt ();
		}
		Arr = SelectionSort (Arr, n);
		System.out.print ("Enter element to be searched: ");
		element = input.nextInt ();
		if (BinarySearch (Arr, element, n)) System.out.println (element + " found.");
		else System.out.println (element + " not found.");
	}
	private static int[] SelectionSort (int arr[], int n) {
		for (int j = 0; j < (n - 1); j++) {
			int small = j;
			for (int k = (j + 1); k < n; k++)
				if (arr[k] < arr[small]) small = k;
			if (small != j) {
				int temp = arr[small];
				arr[small] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
	private static boolean BinarySearch (int arr[], int ele, int n) {
		int low = 0, high = (n - 1), mid;
		while (low <= high) {
			mid = (low + high)/2;
			if (arr[mid] < ele) {
				low = mid + 1;
			}
			else if (ele < arr[mid]) {
				high = mid - 1;
			}
			else {
				return true;
			}
		}
		return false;
	}
}