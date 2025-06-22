package application.service;

import application.exceptions.BookNotFoundException;
import application.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private final List<Book> books = new ArrayList<>();

    public BookService(){}


    public Book getBookById(Integer id){

        if (id == null) throw new IllegalArgumentException("Book ID cannot be null");

        return books.stream().filter(book -> book.id().equals(id))
                .findFirst()
                .orElseThrow(()-> new BookNotFoundException());
    }


}
