import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library( "Roman in sea",  "JK Rowling", "novel");
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Library Management System!");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. List all books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter book details:");
                    System.out.print("Title: ");
                    String title = scanner.next();
                    System.out.print("Author: ");
                    author = scanner.next();
                    System.out.print("ISBN: ");
                    String ISBN = scanner.next();
                    System.out.print("Page Number: ");
                    int pageNumber = scanner.nextInt();
                    System.out.print("Publication Year: ");
                    int publicationYear = scanner.nextInt();
                    System.out.print("Genre: ");
                    String genre = scanner.next();
                    System.out.print("Language: ");
                    String language = scanner.next();
                    System.out.print("Publisher: ");
                    String publisher = scanner.next();

                    Book book = new PrintedBook(title, author, ISBN, pageNumber, publicationYear, genre, language, publisher);
                    library.addBook(book);
                    System.out.println("\nBook added successfully!");
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String ISBNToRemove = scanner.next();
                    if (library.removeBook(ISBNToRemove)) {
                        System.out.println("\nBook removed successfully!");
                    } else {
                        System.out.println("\nBook not found!");
                    }
                    break;
                case 3:
                    System.out.println("\nList of books:");
                    for (Book book : library.getBooks()) {
                        System.out.println(book);
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}