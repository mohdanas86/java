public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    };

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.printf("%d | %s | %s\n", id, title, author);
    }
}