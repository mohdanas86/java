import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBooks(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " Book Added Successfuly..");
    }

    public void viewBook() {
        if (books.isEmpty()) {
            System.out.println("No Books Available..");
            return;
        }
        for (Book b : books) {
            b.display();
        }
    }

    public void searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.display();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void removeBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                System.out.println("Book removed Successfuly..");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
