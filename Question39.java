// program to demonstrate nested try-catch block

class Question39 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		String num = "abc";
		int n;
		try {
			try {
				arr[5] = 10;
			}
			catch (ArrayIndexOutOfBoundsException aioob) {
				System.out.println ("Index out of bounds!\n" + aioob);
			}
			n = Integer.parseInt (num);
			System.out.println ("Number = " + n);
		}
		catch (Exception e) {
			System.out.println ("Exception found!\n" + e);
		}
	}
}