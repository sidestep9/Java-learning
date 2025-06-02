import java.util.ArrayList;

public class User {
	
	ArrayList<Book> borrowedBooks = new ArrayList<>();
	int userId;
	String name;
	String status;
	static int count = 1;

	User(String name) {
		this.userId = count++;
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.printf("ID: %d\n", userId);
		System.out.printf("Name: %s\n", name);
		System.out.printf("Status: %s\n", status);
		customDetails();
		System.out.println("Books: ");
		for(Book book : borrowedBooks) {
			System.out.println("[" + book.id + "] " + book.title + "\n");
		}
	}
	
	protected void customDetails() {
		
	}
	
	void addBorrowedBooks(Book book) {
		borrowedBooks.add(book);
	}
	
	void removeBorrowedBooks(Book book) {
		borrowedBooks.remove(book);
	}
}