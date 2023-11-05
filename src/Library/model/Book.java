package Library.model;

public abstract class Book {
    // поля
    protected long isbn;
    protected String title;
    protected String author;
    protected int yearOfPub;

    // конструктор


    public Book(long isbn, String title, String author, int yearOfPub) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPub = yearOfPub;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return (int) (isbn ^ (isbn >>> 32));
    }

    @Override
    public String toString() {
        return "Book - " +
                "isbn: " + isbn +
                ", title: " + title + '\'' +
                ", author: " + author + '\'' +
                ", yearOfPub: " + yearOfPub;
    }
}
