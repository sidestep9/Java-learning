public class Book {
	String title;
	String author;
	
	static int numOfBooks;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
		numOfBooks++;
	}
	
	void bookInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
	
	static void totalBooks() {
		System.out.println("Total Books: " + numOfBooks);
	}
}