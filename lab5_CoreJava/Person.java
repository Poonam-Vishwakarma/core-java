package lab;
// Person class
class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

// Employee class extending Person
class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Manager class extending Employee
class Manager extends Employee {
    private String post;

    public Manager(String firstName, String lastName, double salary, String post) {
        super(firstName, lastName, salary);
        this.post = post;
    }

    public String getPost() {
        return post;
    }
}

// Citizen class extending Person
class Citizen extends Person {
    private String citizenship;

    public Citizen(String firstName, String lastName, String citizenship) {
        super(firstName, lastName);
        this.citizenship = citizenship;
    }

    public String getCitizenship() {
        return citizenship;
    }
}

public class Main {
    public static void main(String[] args) {
        // Single inheritance
        Employee emp = new Employee("poonam", "vishwakarma", 50000);
        System.out.println("Employee: " + emp.getFirstName() + " " + emp.getLastName() + ", Salary: $" + emp.getSalary());

        // Multi-level inheritance
        Manager manager = new Manager("vishal", "vishwakarma", 70000, "Senior Manager");
        System.out.println("Manager: " + manager.getFirstName() + " " + manager.getLastName() + ", Salary: $" + manager.getSalary() + ", Post: " + manager.getPost());

        // Hierarchical inheritance
        Citizen citizen = new Citizen("jiya", "sharma", "mumbai");
        System.out.println("Citizen: " + citizen.getFirstName() + " " + citizen.getLastName() + ", Citizenship: " + citizen.getCitizenship());
    }
}
