package Library;

import Library.model.Book;
import Library.model.Classical;
import Library.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        book[0] = new Dictionary(101, "Большой толковый словарь", "Кузнецов С.А.", 2014, "толковый словарь", "Норинт");
        book[1] = new Classical(102, "Евгений Онегин", "Пушкин А.С.", 2011, "роман в стихах", "Лабиринт");
        book[2] = new Dictionary(103, "Планета знаний", "Петров А.В.", 2005, "энциклопедический словарь", "Родина");
        book[3] = new Classical(104, "Мцыри", "Лермонтов М.Ю.", 1998,"поэма", "Заря");
    }
    // правка для коммита
    // update 1
    // update 2
    // update 3
}
