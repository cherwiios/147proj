import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System!");
        System.out.println("Press Enter to start...");
        scanner.nextLine(); // Wait for user input to proceed

        // Instantiate LibrarySystem and start it
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start();
    }
}
