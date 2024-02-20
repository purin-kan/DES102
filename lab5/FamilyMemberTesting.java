public class FamilyMemberTesting {
	public static void main(String[] args) {
		
		//Exercise 2-a: use  the dot operator to print out  familyName with commonFund
		System.out.println("# COMMON FUND OF THE FAMILY");
		System.out.println("The " + FamilyMember.familyName + " family has $" + FamilyMember.commonFund);
		
		System.out.println("-------------------------- \n");

		//initialize arrays
		FamilyMember[] familyMembers = new FamilyMember[4];

		//Exercise 2-b: create an array arrayFamily for adding four members.
		familyMembers[0] = new FamilyMember("John", 254639.12);
		familyMembers[1] = new FamilyMember("Erika", 187346.56);
		familyMembers[2] = new FamilyMember("James", 56783.12);
		familyMembers[3] = new FamilyMember("Paris", 12124.88);


		//Exercise 2-b: print private fund for all family members.
		System.out.println("# PRIVATE FUND");
		for (int i = 0; i < familyMembers.length; i++) {
			familyMembers[i].printPrivateFund();
		}
		
		System.out.println("-------------------------- \n");

		//Exercise 3-b: contribute private fund to common fund
		System.out.println("# CONTRIBUTION OF PRIVATE FUND");
		familyMembers[1].contributeToCommonFund(10000);
		familyMembers[3].contributeToCommonFund(10000);
		
		for (int i = 0; i < familyMembers.length; i++) {
			familyMembers[i].printPrivateFund();
		}
		System.out.println("-------------------------- \n");
		
		//Exercise 3-d: print the updated common fund of the family.
		System.out.println("# UPDATED COMMON FUND OF THE FAMILY");
		FamilyMember.printFamilyFund();
		System.out.println("-------------------------- \n");

	}
}
