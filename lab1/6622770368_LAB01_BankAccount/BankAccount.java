public class BankAccount {

	Person person;
	String accountNumber;
	double balance;
	
	BankAccount(String name, String surname, String sex, String occupation, String organization, String accountNumber, double balance) {
		person = new Person(name, surname, sex, occupation, organization);
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void deposit(double x) {
		balance += x;
	}
	
	void withdraw(double x) {
		balance -= x;
	}
	
	void printInfo() {
		person.printInfo();
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println();
	}
	
	void printBalance() {
		System.out.printf("Balance = %s million USD\n", balance);
	}
	
	double convertBalanceToTHB() {
		return balance * 35.63;
	}
}
