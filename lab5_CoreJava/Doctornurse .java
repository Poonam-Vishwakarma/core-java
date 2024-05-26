package lab;
// Doctor class
class Doctor {
    public void surgery() {
        System.out.println("Performing surgery...");
    }
}

// Surgeon class extending Doctor
class Surgeon extends Doctor {
    // Inherits the surgery() method from Doctor
}

// Nurse class extending Doctor
class Nurse extends Doctor {
    public void treatment() {
        System.out.println("Providing treatment...");
    }
}

public class Main {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.surgery(); // Surgeon can perform surgery

        Nurse nurse = new Nurse();
        nurse.surgery(); // Nurse can also perform surgery as inherited from Doctor
        nurse.treatment(); // Nurse can provide treatment
    }
}
