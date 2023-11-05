package Library.dao;

import Library.model.Book;

public interface Library {
    // объявляем методы, только сигнатуры без тела метода
    boolean addBook(Book book);
    Book removeBook(long isbn);
    Book findBook(long isbn);
    int quantity();
    void printBooks();
}
