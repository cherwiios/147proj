import java.util.Scanner;

public class LibrarySystem {
    // Constants defining the maximum number of books and members the library can accommodate
    private static final int MAX_BOOKS = 100;
    private static final int MAX_MEMBERS = 100;

    // Arrays to store book and member objects
    private static Book[] books = new Book[MAX_BOOKS];
    private static Member[] members = new Member[MAX_MEMBERS];

    // Counters to track the number of books and members currently in the system
    private static int bookCount = 0;
    private static int memberCount = 0;

    // Start method to run the main menu of the library system
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Main loop to display options and process user input
        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Display Books");
            System.out.println("4. Display Members");
            System.out.println("5. Calculate Overdue Fine");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after integer input

            // Handle choices using a switch statement
            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> addMember(scanner);
                case 3 -> displayBooks();
                case 4 -> displayMembers();
                case 5 -> calculateFine(scanner);
                case 6 -> running = false; // Exit loop
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close(); // Close scanner when done
    }

    // Method to add a book to the library
    private void addBook(Scanner scanner) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("Library is at full capacity for books.");
            return;
        }
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        int randomId = (int) (Math.random() * 10000) + 1; // Generate a unique random book ID
        books[bookCount++] = new Book(title, author, randomId); // Add new book to the array
        System.out.println("Book added successfully with ID: " + randomId);
    }

    // Method to add a new member to the library
    private void addMember(Scanner scanner) {
        if (memberCount >= MAX_MEMBERS) {
            System.out.println("Library is at full capacity for members.");
            return;
        }
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        members[memberCount++] = new Member(name); // Add new member to the array
        System.out.println("Member added successfully.");
    }

    // Method to display all books in the library
    private void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nBooks in the Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]); // Display each book using the overridden toString method
        }
    }

    // Method to display all members in the library
    private void displayMembers() {
        if (memberCount == 0) {
            System.out.println("No members in the library.");
            return;
        }
        System.out.println("\nMembers in the Library:");
        for (int i = 0; i < memberCount; i++) {
            members[i].displayInfo(); // Display each member's information
        }
    }

    // Method to calculate and display the overdue fine based on the number of overdue days
    private void calculateFine(Scanner scanner) {
        System.out.print("Enter the number of overdue days: ");
        int overdueDays = scanner.nextInt();
        double fine = Math.min(50.0, Math.ceil(overdueDays * 2.5)); // Cap the fine at $50 and calculate based on $2.5 per day
        System.out.printf("The overdue fine is: $%.2f%n", fine); // Print formatted fine amount
    }
}

