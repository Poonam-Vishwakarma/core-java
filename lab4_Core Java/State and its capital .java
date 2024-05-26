import java.util.Scanner;

public class StateCapital{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStates = 10;

        // Arrays to store states and capitals
        String[] states = new String[numStates];
        String[] capitals = new String[numStates];

        // Input states and capitals
        System.out.println("Enter names of 10 states and their capitals:");
        for (int i = 0; i < numStates; i++) {
            System.out.print("State: ");
            states[i] = scanner.next();
            System.out.print("Capital: ");
            capitals[i] = scanner.next();
        }

        // Prompt user for a state
        System.out.print("\nEnter the state whose capital is to be searched: ");
        String state = scanner.next();

        // Search for the state and display its capital
        boolean found = false;
        for (int i = 0; i < numStates; i++) {
            if (states[i].equalsIgnoreCase(state)) {
                System.out.println("The capital is " + capitals[i]);
                found = true;
                break;
            }
        }

        // If state not found, display relevant message
        if (!found) {
            System.out.println("State not found.");
        }
    }
}