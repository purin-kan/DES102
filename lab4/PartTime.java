//Define PartTime to be the subclass of Employee and TaxPayer
public class PartTime extends Employee implements TaxPayer {
	String workPlace;
	int numHrPerWeek;
	double hourlyRate;

	PartTime(String name, String position, String workPlace, int numHrPerWeek, double hourlyRate) { 
		// Use super to initialize name and position
		
		// assign inputs workPlace, numHrPerWeek, and hourlyRate to their corresponding
		// properies

	}

	// define all overridden methods from the abtract parents

	public void printInfo() {
		/*
		 * Print PartTime in the following format name is a position Work at work Place
		 * Yearly income is XXXXX Pay tax $XXXXX
		 */

		System.out.println("--------------------");
	}
}