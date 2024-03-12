public class Employee extends Person {
    String workplace, position;
    double salary;

    Employee(String firstName, String lastName, int day, int month, int year, String workplace, String position, double salary) {
        super(firstName, lastName, day, month, year);
        this.workplace = workplace;
        this.position = position;
        this.salary = salary;
    }

    void printInfo() {
        super.printInfo();
        System.out.printf("Work Place: %s\n" + "Position: %s\n" + "Salary: %.2f\n", workplace, position, salary);
    }

    void followRule(String rule) {
        System.out.printf("%s: %s %s\n" +
                "Followed: %s\n", position, super.name.lastName, super.name.firstName, rule);

    }
}
