import java.util.Scanner;

/* declare a Java class called SavingsAccount with members accountNumber and
	Balance and member functions depositAmount and withdrawAmount if user tries to withdraw amount greater than their balance throw a user-defined exception */

class SavingsAccount extends Exception { // inheriting Exception class
	String accountNumber;
	double Balance;
	SavingsAccount (String acNum, double initmoney) {
		accountNumber = acNum;
		Balance = initmoney;
	}
	public void depositAmount (double deposit)  {
		Balance += deposit;
		System.out.println ("Money deposited! Balance = " + Balance);
	}
	public void withdrawAmount (double withdraw) throws SavingsAccount {
		// method can throw SavingsAccount type error
		if (withdraw > Balance) throw new SavingsAccount (accountNumber, Balance);
		else {
			Balance -= withdraw;
			System.out.println ("Money withdrawn! Balance = " + Balance);
		}
	}
	public String toString () { // reimplementing toString method of Exception class
		return "WithdrawException! " + accountNumber + " balance = " + Balance + " less than withdraw amount:";
	}
}

class Question45 {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		double value;
		char ans = 'Y';
		byte choice;
		SavingsAccount acc = new SavingsAccount ("SB1001", 0.0);
		System.out.print ("Make initial deposit: ");
		value = input.nextDouble ();
		acc.depositAmount (value);
		// menu-driven
		while (ans == 'Y' || ans == 'y') {
			System.out.println ("1.Deposit\n2.Withdraw");
			System.out.print ("Choice?: ");
			choice = input.nextByte ();
			switch (choice) {
				case 1: System.out.print ("Enter deposit amount: ");
						value = input.nextDouble ();
						acc.depositAmount (value);
						break;
				case 2: try { // try-catch inside a switch-case inside a while loop
					System.out.print ("Enter withdraw amount: ");
					value = input.nextDouble ();
					acc.withdrawAmount (value);
					}
					catch (SavingsAccount sa) {
						System.out.println (sa + " " + value);
					}
					break;
				default: System.out.println ("Invalid choice!");
			}
			System.out.print ("Continue? (Y/N): ");
			ans = input.next ().charAt (0); // taking character input
		}
	}
}