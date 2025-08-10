package application.database;

import application.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDataBaseInMemory implements BookRepository {

    private static BookDataBaseInMemory bookDataBaseInMemory;

    private final List<Book> books = new ArrayList<>();

    private BookDataBaseInMemory(){}

    public static synchronized BookDataBaseInMemory getInstance(){

        if(bookDataBaseInMemory == null){
            bookDataBaseInMemory = new BookDataBaseInMemory();
        }
        return bookDataBaseInMemory;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void removeAllBooks() {
        books.removeAll(books);
    }



}
