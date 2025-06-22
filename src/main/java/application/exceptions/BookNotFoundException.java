package application.exceptions;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(){
        super("Book with that id doesnt exist");
    }

}
