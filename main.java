public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create books
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Create a user
        User user = new User("Akash", 101);

        // Issue a book
        System.out.println("User " + user.getName() + " is requesting '1984'");
        library.issueBook("1984");

        // Try issuing the same book again
        System.out.println("User " + user.getName() + " is requesting '1984' again");
        library.issueBook("1984");

        // Return the book
        System.out.println("User " + user.getName() + " is returning '1984'");
        library.returnBook("1984");

        // Try returning a book that's already returned
        library.returnBook("1984");
    }
}
