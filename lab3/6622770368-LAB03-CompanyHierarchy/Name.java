public class Name {
    String firstName, lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printName() {
        System.out.println(firstName + " " + lastName);
    }
}
