package application.database;

import application.model.Book;
import java.util.List;

public interface BookRepository {
    List<Book> getBooks();
    void removeAllBooks();
}
