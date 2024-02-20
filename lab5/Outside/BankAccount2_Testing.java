package Outside;

import Developer.BankAccount;

public class BankAccount2_Testing {
	public static void main(String[] args) {
		BankAccount account2 = new BankAccount("Paris Hilton", "127-983-3847", 1000000.00);

		// account2.printInfo();
		// printInfo() has the default visibility modifier, 
		// only same package has access, which BankAccount2_Testing is not in the same package.

		// account2.withdraw(300.00);
		// withdraw() has the protected visibility modifier

		System.out.println("The balance of account2 is $" + account2.getBalance());
		// balance has the private visibility modifier
	}
}
