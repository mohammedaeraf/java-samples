
import java.util.ArrayList;
import java.util.Scanner;

public class BookSearchDemo {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding sample books
        bookList.add(new Book(1, "Java Basics", "John Doe"));
        bookList.add(new Book(2, "Python Programming", "Jane Smith"));
        bookList.add(new Book(3, "C++ Essentials", "Mark Twain"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title to search: ");
        String searchTitle = scanner.nextLine();

        // Search by title
        Book foundBook = findBookByTitle(bookList, searchTitle);

        System.out.println(foundBook.getAuthor());

        // if (foundBook != null) {
        // System.out.println("Book found:");
        // System.out.println(foundBook);
        // } else {
        // System.out.println("Book not found.");
        // }

        scanner.close();
    }

    // Method to search for a book by title
    public static Book findBookByTitle(ArrayList<Book> books, String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}

class Book {
    private int id;
    private String title;
    private String author;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString() method for displaying book info
    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author;
    }
}
