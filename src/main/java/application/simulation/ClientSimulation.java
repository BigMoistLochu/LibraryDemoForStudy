package application.simulation;

import application.service.BookService;

public class ClientSimulation {

    private final BookService bookService;



    public ClientSimulation(BookService bookService) {
        this.bookService = bookService;
    }

    public void randomOperation(int randomNumber){
        switch (randomNumber){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
        }
    }








}
