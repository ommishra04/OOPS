package Experiment4;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = 0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = 0;
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + publicationYear);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "John Doe");
        Book book3 = new Book("Data Structures", "Alice Smith", 2020);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}

