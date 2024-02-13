//Define class full time to be a subclass of Employee and TaxPayer
public class FullTime extends Employee implements TaxPayer{
	double salary;
	String workPlace;

	FullTime(String name, String position, String workPlace, double salary) { 
		super(name, position);
		this.workPlace = workPlace;
		this.salary = salary;
	}

	void printWorkPlace() {
		System.out.println("Work at " + workPlace);
	}

	double calculateMonthlyIncome() {
		return salary;
	}

	public double calculateYearlyIncome() {
		return salary * 12;
	}

	public double calculateTax() {
		return super.calculateTaxRate(calculateYearlyIncome()) * calculateYearlyIncome();
	}

	public void payTax() {
		System.out.println("Pay tax $" + calculateTax());
	}

	public void printInfo() {
		super.printInfo();
		printWorkPlace();
		System.out.println("Yearly income is " + calculateYearlyIncome());
		System.out.println("Pay Tax $" + calculateTax());
		System.out.println("--------------------");
	}
}