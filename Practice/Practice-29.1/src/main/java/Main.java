public class Main {
	public static void main(String[] args) {
		
		Book book1 = new Book("Harry Potter", "J.K. Rowling");
		Book book2 = new Book("LOTR", "Tolkien(?)");
		Book book3 = new Book("ASOIAF", "No idea");
		
		book1.bookInfo();
		book2.bookInfo();
		book3.bookInfo();
		
		Book.totalBooks();
	}
}