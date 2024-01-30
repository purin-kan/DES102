public class Person {

	String name, surname, sex, occupation, organization;
	
	Person(String name, String surname, String sex, String occupation, String organization) {
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.occupation = occupation;
		this.organization = organization;
	}
	
	void printInfo() {
		System.out.format("Name: %s\nSurname: %s\nSex: %s\nOccupation: %s\nOrganization: %s\n", name, surname, sex, occupation, organization);
	}
}
