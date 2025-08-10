package application.database;

import application.model.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class BookDataBaseMysql implements BookRepository {


    public BookDataBaseMysql(){
        String url = "jdbc:mysql://localhost:3306/LibraryDataBase";
        String user = "user1";
        String password = "haslo1";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Połączono z bazą danych!");
            }


        } catch (SQLException e) {
            System.out.println("Błąd połączenia z bazą danych!");
            e.printStackTrace();
        }
    }


    @Override
    public List<Book> getBooks() {
        return List.of();
    }

    @Override
    public void removeAllBooks() {

    }
}
