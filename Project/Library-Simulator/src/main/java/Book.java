public class Book {
	
	int id;
	String title;
	String author;
	int quantity;
	boolean isAvailable;
	static int count = 1;
	
	Book(String title, String author, int quantity) {
		this.id = count++;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		if(quantity > 0) {
			this.isAvailable = true;
		}
		else {
			this.isAvailable = false;
		}
	}
	
	void displayInfo() {
		System.out.printf("ID: %d\n", id);
		System.out.printf("Title: %s\n", title);
		System.out.printf("Author: %s\n", author);
		System.out.printf("Quantity: %d\n", quantity);
		if(isAvailable) {
			System.out.println("Available: Yes");
		}
		else {
			System.out.println("Available: No");
		}
	}
}