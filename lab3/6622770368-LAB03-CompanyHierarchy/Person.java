public class Person {
    Name name;
    Date dateOfBirth;
    static int numPerson = 0;

    Person(String firstName, String lastName, int day, int month, int year) {
        name = new Name(firstName, lastName);
        dateOfBirth = new Date(day, month, year);

        numPerson++;
    }

    void printInfo() {
        System.out.printf("Name: %s %s\n" + "DOB: %d-%d-%d\n", name.firstName, name.lastName, dateOfBirth.day, dateOfBirth.month, dateOfBirth.year);
        printAgeAtYear(2024);
    }

    void printAgeAtYear(int year) {
        System.out.println("Age: " + Integer.toString(year - dateOfBirth.year));
    }

    static void printNumberOfPerson() {
        System.out.printf("The total number of Persons is %s persons.\n", numPerson);
    }
}
