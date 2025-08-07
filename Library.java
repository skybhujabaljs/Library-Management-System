import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isIssued()) {
                book.issue();
                System.out.println("Book issued: " + title);
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or not issued: " + title);
    }
}
