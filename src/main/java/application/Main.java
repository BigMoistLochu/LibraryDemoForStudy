package application;


import application.database.BookDataBaseInMemory;
import application.database.BookDataBaseMysql;
import application.database.BookRepository;
import application.model.Book;
import application.service.BookService;
import application.simulation.ClientSimulation;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        //dependency
        BookRepository bookDataBase = BookDataBaseInMemory.getInstance();
        BookService bookService = new BookService(bookDataBase);

        BookDataBaseMysql bookDataBaseMysql = new BookDataBaseMysql();



        //workflow
        Book book = new Book(1,"213","dsad");
        bookService.save(book);

        Book book1 = bookService.getById(2).orElse(null);
        System.out.println(book1);
        ClientSimulation simulation = new ClientSimulation(bookService);

        while (true){
            int random = ThreadLocalRandom.current().nextInt(1, 5); // od 1 do 5
            simulation.randomOperation(random);
        }


    }





}