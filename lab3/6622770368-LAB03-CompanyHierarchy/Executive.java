public class Executive extends Employee {
    double bonus;

    Executive(String firstName, String lastName, int day, int month, int year, String workplace, String position,
            double salary, double bonus) {
        super(firstName, lastName, day, month, year, workplace, position, salary);
        this.bonus = bonus;
    }

    void printInfo() {
        super.printInfo();
        System.out.printf("Bonus: %.2f\n", bonus);
    }

    void announceRule(String rule) {
        System.out.printf("Position: %s %s\nAnnounces rule: %s\n", super.name.firstName, super.name.lastName, rule);
    }
}
