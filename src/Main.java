import java.util.Scanner;

/**
 * Main class to run the library management system.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to begin...");

        scanner.nextLine();

        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start();
    }
}

