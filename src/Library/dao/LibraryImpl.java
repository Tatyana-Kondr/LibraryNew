package Library.dao;

import Library.model.Book;

public class LibraryImpl implements Library{
    // поля
    private Book[] books; //массив для хранения книг
    private int size; // текущее кол-во книг

    public LibraryImpl(int capacity){
        books = new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующего
        if(book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                Book victim = books[i]; // убрали найденный в переменную
                books[i] = books[size - 1]; // на место найденного поставили последний сущ. элемент в массиве
                books[size - 1] = null; // обнулили последний
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){ // нашелся элемент массива, у которого совпал id
                return books[i]; // вернули найденный элемент массива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
