public abstract class Employee {
	String name;
	String position;

	public Employee(String name, String position) {
		this.name = name;
		this.position = position;
	}

	abstract double calculateMonthlyIncome();

	abstract void printWorkPlace();

	public void printInfo() {
		System.out.println(name + " is a " + position);
	}


	public double calculateTaxRate(double salary_year) {
		if (salary_year <= 200000)
			return 0.0;
		else if (salary_year <= 400000)
			return 0.05;
		else if (salary_year <= 600000)
			return 0.1;
		else if (salary_year <= 800000)
			return 0.15;
		else
			return 0.2;
	}
}
