public class PartTime extends Employee implements TaxPayer {
	String workPlace;
	int numHrPerWeek;
	double hourlyRate;

	PartTime(String name, String position, String workPlace, int numHrPerWeek, double hourlyRate) { 
		super(name, position);
		this.workPlace = workPlace;
		this.numHrPerWeek = numHrPerWeek;
		this.hourlyRate = hourlyRate;
	}

	void printWorkPlace() {
		System.out.println("Work at " + workPlace);
	}

	double calculateMonthlyIncome() {
		return numHrPerWeek * 4 * hourlyRate;
	}

	public double calculateYearlyIncome() {
		return calculateMonthlyIncome() * 12;
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
		System.out.println("Pay Tax " + calculateTax());

		System.out.println("--------------------");
	}
}
