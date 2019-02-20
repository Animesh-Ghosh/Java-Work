import static java.lang.Math.pow;

// program to print Armstrong number upto 1000
// https://en.wikipedia.org/wiki/Narcissistic_number

class Question11 {
	public static void main (String[] args) {
		for (int i = 1; i < 1000; i++) {
			int digit_count = 0, sum = 0, digit = 0, num;
			num = i;
			while (num > 0) {
				digit_count++;
				num /= 10;
			}
			num = i;
			while (num > 0) {
				digit = num % 10;
				sum += (int) (pow (digit, digit_count));
				num /= 10;
			}
			if (sum == i) System.out.println (i + " is an Armstrong number.");
		}
	}
}