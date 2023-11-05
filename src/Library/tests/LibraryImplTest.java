package Library.tests;

import Library.dao.Library;
import Library.dao.LibraryImpl;
import Library.model.Book;
import Library.model.Classical;
import Library.model.Dictionary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] bo;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        bo = new Book[4];
        bo[0] = new Dictionary(101, "Большой толковый словарь", "Кузнецов C.A.", 2014, "толковый словарь", "Норинт");
        bo[1] = new Classical(102, "Евгений Онегин","Пушкин A.C.",  2011, "роман в стихах", "Лабиринт");
        bo[2] = new Dictionary(103, "Планета знаний","Петров А.В.",  2005, "энциклопедический словарь", "Родина");
        bo[3] = new Classical(104, "Мцыри","Лермонтов М.Ю.",  1998,"поэма", "Заря");

        for (int i = 0; i < bo.length; i++) {
            library.addBook(bo[i]);
        }
    }

    @Test
    void addBookTest() {
        assertFalse(library.addBook(null)); // не можем добавить null
        assertFalse(library.addBook(bo[1])); // не можем добавить уже существующую
        Book bo1 = new Dictionary(105, "Ушаков Д.Н.", "Орфографический словарь", 2020, "аспектный словарь", "Просвещение");
        assertTrue(library.addBook(bo1)); // добавили новую книгу
        assertEquals(5, library.quantity());
        Book bo2 = new Dictionary(106, "Ушаков Д.Н.","Толковый словарь",  2020, "аспектный словарь", "Просвещение");
        assertFalse(library.addBook(bo2)); // не можем превысить capacity
    }

    @Test
    void removeBookTest() {
        assertEquals(bo[2],library.removeBook(103));  // удаляем книгу
        assertEquals(3,library.quantity()); // стало на 1 меньше книгу
        assertNull(library.removeBook(103));  // дважды не можем удалить
        assertNull(library.findBook(103)); // не можем найти после удаления
    }

    @Test
    void findBookTest() {
        assertEquals(bo[1], library.findBook(102));  // ищем книгу по isbn
        assertNull(library.findBook(106));  // ищем несуществующую книгу
    }

    @Test
    void quantity() {
        assertEquals(4, library.quantity());
    }

    @Test
    void printBooks() {
        library.printBooks();
    }

    @Test
    void findByAuthorTest(){
        printArray(bo);
        Arrays.sort(bo, (a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()));
        printArray(bo);
    }
    private void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------------------------");
    }

}