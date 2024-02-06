public class TestCompanyHierarchy {
    public static void main(String[] args) {
        // a) print out title of “company information”.
        System.out.println("### FUTURETECH COMPANY INFORMATION ###");

        // b) print out a title of “Visitor Information” and call printInfo() of person01 and person02
        System.out.println(">> Visitor Information");

        // construct Person objects
        Person person01 = new Person("Somyai", "Yodyium", 15, 4, 1987);
        Person person02 = new Person("Pitak", "Raksa", 1, 8, 1980);
        
        // print out information
        person01.printInfo();
        System.out.println("-------------------------");
        person02.printInfo();
        System.out.println("-------------------------\n");
        
        // c) print out a title of “Employee Information” and call printInfo() of employee01 and employee02.
        System.out.println(">> Employee Information");
        // construct Employee objects
        Employee employee01 = new Employee("Maneeya", "Rinrom", 15, 4, 1987, "FutureTech CO.", "Secretary", 15000.0);
        Employee employee02 = new Employee("Parinya", "Yenjid", 5, 11, 1990, "FutureTech CO.", "Technician", 22000.0);
        
        // print out employee information
        employee01.printInfo();
        System.out.println("-------------------------");
        employee02.printInfo();
        System.out.println("-------------------------\n");

        // d) print out a title of “Executive information” and call printInfo() of executive01 and executive02.
        System.out.println(">> Executive Information");

        // construct Executive objects
        Executive executive01 = new Executive("Preecha", "Yanusit", 30, 4, 1977, "FutureTech CO.", "Sale manager", 40000.0, 80000.0);
        Executive executive02 = new Executive("Songpol", "Sangar", 10, 11, 1972, "FutureTech CO.", "Finance Manager", 38000.0, 76000.0);

        // print out employee information
        executive01.printInfo();
        System.out.println("-------------------------");
        executive02.printInfo();
        System.out.println("-------------------------\n");
        
        // e) print out title of "Rule Announcement" and
        // call the method announceRule() with input String “take no nap during working hours” of executive01.
        System.out.println(">> Rule Announcement");
        executive01.announceRule("No nap during working hours");
        System.out.println("-------------------------\n");
        
        // f) print out title of "Rule Follower" and
        // call followRule() method with input String “No nap during working hours” of employee01 and employee02.
        System.out.println(">> Rule Follower");
        employee01.followRule("No nap during working hours");
        employee02.followRule("No nap during working hours");
        System.out.println("-------------------------\n");
        
        // g) print out title of “CEO Information” and call printInfo() of ceo01.
        System.out.println(">> CEO Information");
        // Construct President
        CEO ceo0 = new CEO("Sipol", "Tongyai", 19, 9, 1956, "FutureTech CO.", "President", 150000.0, 500000.0, "BMW A5");
        // print out employee information
        ceo0.printInfo();
        System.out.println("-------------------------\n");

        // h) print out title of “CEO Vision” and call showVision()
        System.out.println(">> CEO Vision");
        ceo0.showVision("becoming ISO standard");
        System.out.println("-------------------------\n");

        // i) print out title of “Number of Person” and
        // call the static method printNumberOfPerson from the Person class.
        System.out.println(">> Number of Person");
        Person.printNumberOfPerson();
        }
}
