import java.util.Scanner;

// program to input 10 numbers and sort them

class Question21 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] Arr = new int[10];
		System.out.println ("Enter numbers in array: ");
		for (int i = 0; i < 10; i++) {
			System.out.print ("Enter number: ");
			Arr[i] = input.nextInt ();
		}
		System.out.println ("Array before sorting: ");
		for (int i = 0; i < 10; i++)
			System.out.print (Arr[i] + " ");
		Arr = SelectionSort (Arr, 10);
		System.out.println ("\nArray after sorting: ");
		for (int i = 0; i < 10; i++) 
			System.out.print (Arr[i] + " ");
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
}