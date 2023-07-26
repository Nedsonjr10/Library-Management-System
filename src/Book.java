import java.util.List;
 import java.util.ArrayList;
 import java.util.Map;
 import java.util.HashMap;

 class Book{
    
    private String title;
    private String author;
    private String ISBN;
    private int numberOfCopies;
    
    public Book(String title, String author, String ISBN, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numberOfCopies = numberOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

}

class Library {
     
    Map <String , Book> books = new HashMap<>();
    
    public void addBook (Book book){
        books.put(book.getISBN(), book);
    }

    public void deleteBook (String ISBN){
        books.remove(ISBN);
    }
    public List <Book> searchByTitle (String title){
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books.values()){
            if (book.getTitle().equalsIgnoreCase(title)){
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    public List <Book> searchByAuthor (String author){
        List <Book> matchingBooks =  new ArrayList<>();
        for (Book book : books.values()){
            if (book.getAuthor().equalsIgnoreCase(author)){
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
    
    
}