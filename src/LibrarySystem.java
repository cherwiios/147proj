import java.util.Scanner;

/**
 * Manages library operations such as adding books and members, and calculating fines.
 */
public class LibrarySystem {
    private static final int MAX_BOOKS = 100;
    private static final int MAX_MEMBERS = 100;

    private static Book[] books = new Book[MAX_BOOKS];
    private static Member[] members = new Member[MAX_MEMBERS];

    private static int bookCount = 0;
    private static int memberCount = 0;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Display Books");
            System.out.println("4. Display Members");
            System.out.println("5. Calculate Overdue Fine");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> addMember(scanner);
                case 3 -> displayBooks();
                case 4 -> displayMembers();
                case 5 -> calculateFine(scanner);
                case 6 -> running = false;
                default -> System.out.println("Please try again.");
            }
        }

        scanner.close();
    }

    private void addBook(Scanner scanner) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("The library has reached its book limit.");
            return;
        }
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        int randomId = (int) (Math.random() * 10000) + 1;
        books[bookCount++] = new Book(title, author, randomId);
        System.out.println("Book added successfully with ID: " + randomId);
    }

    private void addMember(Scanner scanner) {
        if (memberCount >= MAX_MEMBERS) {
            System.out.println("The library has reached its member limit.");
            return;
        }
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        members[memberCount++] = new Member(name);
        System.out.println("Member added successfully.");
    }

    private void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nBooks in the Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].display());
        }
    }

    private void displayMembers() {
        if (memberCount == 0) {
            System.out.println("No members in the library.");
            return;
        }
        System.out.println("\nMembers in the Library:");
        for (int i = 0; i < memberCount; i++) {
            members[i].displayInfo(true);
        }
    }

    private void calculateFine(Scanner scanner) {
        System.out.print("Enter the number of overdue days: ");
        int overdueDays = scanner.nextInt();
        double fine = overdueDays > 20 ? 50.0 : overdueDays * 2.5;
        System.out.printf("The overdue fine is: $%.2f%n", fine);
    }
}
