import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream
        Scanner scanner = new Scanner(System.in);

        // Greeting message for the user
        System.out.println("Welcome to the Library Management System!");
        System.out.println("Press Enter to start...");

        // Waits for the user to press Enter to proceed
        scanner.nextLine();

        // Create an instance of LibrarySystem and start the system
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start(); // Start the library system which is likely to handle further interactions
    }
}
