
public class Library {
    String name;
    int year;
    Books[] books;
    
    Library(String name, int year, Books[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }
    
    void booksInfo() {
        for(Books book: books) {
            book.displayInfo();
        }
    }
}