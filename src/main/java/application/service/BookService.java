package application.service;

import application.database.BookRepository;
import application.model.Book;
import java.util.Objects;
import java.util.Optional;

public class BookService implements ServiceGeneric<Book> {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void save(Book entity) {

        Objects.requireNonNull(entity);
        bookRepository.getBooks().add(entity);
    }

    @Override
    public Optional<Book> getById(Integer id) {

        Objects.requireNonNull(id,"Book ID cannot be null");

        return bookRepository.getBooks().stream()
                .filter(book -> book.id().equals(id))
                .findFirst();
    }
}
