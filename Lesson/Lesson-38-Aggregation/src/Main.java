
public class Main {
    
    public static void main(String[] args) {
        // Aggregation = Represents a "has-a" relationships between objects
        //               One object contains another object as part of its structure.
        //               But the contained object/s can exist independently.
        
        Books book1 = new Books("Random book 1", 123);
        Books book2 = new Books("Random book 2", 298);
        Books book3 = new Books("Random book 3", 833);
        
        Books[] books = {book1, book2, book3};
        Library library = new Library("Library Random", 1999, books);
        
        library.booksInfo();
    }
    
}