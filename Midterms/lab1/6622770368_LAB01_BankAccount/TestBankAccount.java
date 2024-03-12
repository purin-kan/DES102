public class TestBankAccount {
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Wang", "TaLu", "Male", "Actor", "SIIT", "000-000-0000", 10);
		account.printInfo();
		
		account.person.name = "Purin";
		account.person.surname = "Kanjanakumnerd";
		account.person.sex = "Male";
		
		account.printInfo();
		
		account.deposit(15);
		account.printBalance();
		
		account.withdraw(5);
		account.printBalance();
		
		System.out.println(account.convertBalanceToTHB() + " Million THB");
		
	}
}
