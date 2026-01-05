public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBooks(new Book(0, "Python", "Anas"));
        library.addBooks(new Book(1, "Java", "John"));

        library.viewBook();
    }
}
