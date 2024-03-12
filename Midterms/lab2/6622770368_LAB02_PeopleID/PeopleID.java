public class PeopleID {
    Name name;
    String ID;
    Date dateOfBirth;
    Address address;

    public PeopleID(Name name, String ID, Date dateOfBirth, Address address) {
        this(name, ID);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public PeopleID(Name name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void printPeopleID() {
        name.printName();
        System.out.println(ID);
        dateOfBirth.printDate();
        address.printFullAddress();
    }
}
