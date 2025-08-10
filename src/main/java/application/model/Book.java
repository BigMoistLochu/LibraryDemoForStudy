package application.model;


public record Book(Integer id, String title,String author){

   public Book {
       if(id == null) throw new IllegalArgumentException("Book Id cannot be null");
       if(id <= 0) throw new IllegalArgumentException("Book Id cannot be negative value");
   }

}
