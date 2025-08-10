package application.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {


    //nazwaMetody_warunki_oczekiwanyRezultat


    @Test
    public void constructor_withZeroId_throwsIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> new Book(0,"title","author"));
    }

    @Test
    public void constructor_withNegativeId_throwsIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> new Book(-1,"title","author"));
    }

    @Test
    public void constructor_withPositiveId_CreateCorrectBook(){
        Book book = new Book(1,"title","author");
        Book anotherBook = new Book(1,"title","author");
        Assertions.assertEquals(book,anotherBook);
        Assertions.assertTrue(book.equals(anotherBook));
        Assertions.assertTrue(anotherBook.equals(book));
    }



}
