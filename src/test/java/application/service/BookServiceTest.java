package application.service;

import application.database.BookDataBaseInMemory;
import application.database.BookRepository;
import application.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookServiceTest {


    private BookService systemUnderTest;

    @BeforeEach
    void removeBooksFromDataBase(){
        BookRepository bookDataBase = BookDataBaseInMemory.getInstance();
        systemUnderTest = new BookService(bookDataBase);
        bookDataBase.removeAllBooks();
    }


    @Test
    public void save_whenValidParams_ThenSaveBook(){

        // Given
        Book book = new Book(1,"title","author");

        // When
        systemUnderTest.save(book);

        // Then
        Assertions.assertEquals(systemUnderTest.getById(1),book);
    }

    @Test
    public void save_WhenBookIsNull_ThenThrowNullPointException(){
        // Given
        Book book = null;

        Assertions.assertThrows(NullPointerException.class,() -> systemUnderTest.save(book));
    }




}
