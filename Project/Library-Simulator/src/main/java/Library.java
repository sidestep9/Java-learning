import java.util.ArrayList;

public class Library {
	
	ArrayList<Book> books = new ArrayList<>();
	ArrayList<User> users = new ArrayList<>();
	
	Book searchBook(String input) {
		for(Book book : books) {
			if(input.equalsIgnoreCase(book.title) || input.equals(String.valueOf(book.id))) return book;
		}
		return null;
	}
	
	User searchUser(String input) {
		for(User user : users) {
			if(input.equalsIgnoreCase(user.name) || input.equals(String.valueOf(user.userId))) return user;
		}
		return null;
	}
	
	void addBook(Book book) {
		books.add(book);
	}
	
	void addBook(String title, String author, int quantity) {
		books.add(new Book(title, author, quantity));
		System.out.println("Book added");
	}
	
	void removeBook(String title) {
		Book book = searchBook(title);
		books.remove(book);
		System.out.println("Book removed");
	}
	
	void addUser(User user) {
		users.add(user);
	}
	
	void addUser(String name, String extra, int num) {
		if(num == 1) users.add(new Student(name, extra));
		else if(num == 2) users.add(new Guest(name, extra));
		System.out.println("User added");
	}
	
	void removeUser(String name) {
		User user = searchUser(name);
		users.remove(user);
		System.out.println("User removed");
	}
	
	void viewAllBooks() {
		System.out.printf("| %-4s | %-16s | %-16s | %-4s |\n", "ID", "TITLE", "AUTHOR", "QTY");
		for(Book book : books) {
			System.out.printf("| %-4d | %-16s | %-16s | %-4s |\n", book.id, book.title, book.author, book.quantity);
			// p.s I'd like to add more like quantity or availability but my phone screen wouldn't let me huhu ;-;
			// it even break the table if the book title/author name is too long...
		}
	}
	
	void viewAllUsers() {
		System.out.printf("| %-4s | %-16s | %-7s | %-7s |\n", "ID", "NAME", "STATUS", "BOOKS");
		for(User user : users) {
			System.out.printf("| %-4d | %-16s | %-7s | %-7d |\n", user.userId, user.name, user.status, user.borrowedBooks.size());
		}
	}
	
	void borrowBook(String name, String title) {
		User user = searchUser(name);
		Book book = searchBook(title);
		
		if(book.quantity < 1) {
			System.out.println("Book stock is empty");
			return;
		}
		for(Book ubb : user.borrowedBooks) {
			if(ubb.title.equals(book.title)) {
				System.out.println("Can't borrow the same book");
				return;
			}
		}
		if(user.borrowedBooks.size() >= 2) {
			System.out.println("Can't borrow more than two books");
			return;
		}
		
		user.addBorrowedBooks(book);
		book.quantity -= 1;
		System.out.println("Book checked out");
	}
	
	void returnBook(String name, String title) {
		User user = searchUser(name);
		Book book = searchBook(title);
		
		user.removeBorrowedBooks(book);
		book.quantity += 1;
		System.out.println("Book returned");
	}
	
	void changeTitle(String title, String newTitle) {
		Book book = searchBook(title);	
		book.title = newTitle;
		System.out.println("Title changed");
	}
	
	void changeAuthor(String title, String author) {
		Book book = searchBook(title);	
		book.author = author;
		System.out.println("Author changed");
	}
	
	void changeQuantity(String title, int quantity) {
		Book book = searchBook(title);	
		book.quantity = quantity;
		System.out.println("Quantity changed");
	}
}