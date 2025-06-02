import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static String border = "*".repeat(29);
	static Library library = new Library();
	
	public static void main(String[] args) {
		
		library.addBook(new Book("Harry Potter", "J.K. Rowling", 3));
		library.addUser(new Student("Jane", "9th Grade"));
		
		int choice;
		boolean isExit = false;
		
		do {
			System.out.println(border);
			System.out.println("LIBRARY SYSTEM");
			System.out.println(border);
			System.out.println("[1] View all books");
			System.out.println("[2] View all users");
			System.out.println("[3] Search book");
			System.out.println("[4] Search user");
			System.out.println("[5] Borrow book");
			System.out.println("[6] Return book");
			System.out.println("[7] Update book");
			System.out.println("[8] Update user");
			System.out.println("[9] Exit");
			System.out.println(border);
			choice = inputInt("Enter (1-9): ");
			System.out.println(border);
			switch(choice) {
				case 1:
					library.viewAllBooks();
				break;
				case 2:
					library.viewAllUsers();
				break;
				case 3:
					searchBook();
				break;
				case 4:
					searchUser();
				break;
				case 5:
					borrowBook();
				break;
				case 6:
					returnBook();
				break;
				case 7:
					updateBook();
				break;
				case 8:
					updateUser();
				break;
				case 9:
					isExit = true;
				break;
				default:
					System.out.println("Invalid input");
			}
		}while(!isExit);
		
		System.out.println("Goodbye and have a nice day!");
		
		scanner.close();
	}
	
	static int inputInt(String prompt) {
		int num;
		while(true) {
			System.out.print(prompt);
			if(scanner.hasNextInt()) {
				num = scanner.nextInt();
				scanner.nextLine();
				return num;
			}
			else {
				System.out.println("Invalid input");
				scanner.nextLine();
			}
		}
	}
	
	static String userIdNameInput(String prompt) {
		String input;
		
		System.out.print(prompt);
		input = scanner.nextLine().trim();
		for(User user : library.users) {
			if(input.equalsIgnoreCase(user.name) || input.equals(String.valueOf(user.userId))) {
					return input;
			}
		}
		System.out.println("ID or Name not found");
		return null;
	}
	
	static String bookIdTitleInput(String prompt) {
		String input;
		
		System.out.print(prompt);
		input = scanner.nextLine().trim();
		for(Book book : library.books) {
			if(input.equalsIgnoreCase(book.title) || input.equals(String.valueOf(book.id))) {
					return input;
			}
		}
		System.out.println("ID or Title not found");
		return null;
	}
	
	static void searchBook() {
		String title;
		
		title = bookIdTitleInput("Enter book ID/Title: ");
		if(title == null) return;
		System.out.println(border);
		library.searchBook(title).displayInfo();
		System.out.println(border);
	}
	
	static void searchUser() {
		String name;
		
		name = userIdNameInput("Enter used ID/Name: ");
		if(name == null) return;
		System.out.println(border);
		library.searchUser(name).displayInfo();
		System.out.println(border);
	}
	
	static void borrowBook() {
		String name;
		String title;
		 
		 name = userIdNameInput("Enter user ID/Name: ");
		 if(name == null) return;
		 title = bookIdTitleInput("Enter book ID/Title: ");
		 if(title == null) return;
		 library.borrowBook(name, title);
	}
	
	static void returnBook() {
		String name;
		String title;
		 
		 name = userIdNameInput("Enter user ID/Name: ");
		 if(name == null) return;
		 title = bookIdTitleInput("Enter book ID/Title: ");
		 if(title == null) return;
		 library.returnBook(name, title);
	}
	
	static void updateBook() {
		int choice;
		
		System.out.println("[1] Add book");
		System.out.println("[2] Remove book");
		System.out.println("[3] Update book information");
		choice = inputInt("Enter (1-3): ");
		switch(choice) {
			case 1:
				addBook();
			break;
			case 2:
				removeBook();
			break;
			case 3:
				updateBookInfo();
			break;
			default:
				System.out.println("Invalid choice");
		}
		
	}
	
	static void addBook() {
		String title;
		String author;
		int quantity;
		
		System.out.print("Enter book title: ");
		title = scanner.nextLine().trim();
		for(Book book : library.books) {
			if(title.equalsIgnoreCase(book.title)) {
					System.out.println("Book already exist");
					return;
			}
		}
		System.out.print("Enter book author: ");
		author = scanner.nextLine().trim();
		System.out.print("Enter book quantity: ");
		quantity = scanner.nextInt();
		scanner.nextLine();
		
		library.addBook(title, author, quantity);
	}
	
	static void removeBook() {
		String title;
		String choice;
		
		title = bookIdTitleInput("Enter book ID/Title: ");
		if(title == null) return;
		library.searchBook(title).displayInfo();
		System.out.print("Confirm removal (Y/N): ");
		choice = scanner.nextLine().trim().toLowerCase();
		switch(choice) {
			case "y":
				library.removeBook(title);
			break;
			case "n":
				System.out.println("Removal canceled");
			break;
			default:
				System.out.println("Invalid choice");
		}
	}
	
	static void updateBookInfo() {
		String title;
		String newTitle;
		String author;
		int quantity;
		int choice;
		boolean isExit = false;
		
		title = bookIdTitleInput("Enter book ID/Title: ");
		if(title == null) return;
		library.searchBook(title).displayInfo();
		do {
			System.out.println("[1] Change title");
			System.out.println("[2] Change author");
			System.out.println("[3] Change quantity");
			System.out.println("[4] Exit");
			choice = inputInt("Enter (1-4): ");
			switch(choice) {
				case 1:
					System.out.print("Enter new title: ");
					newTitle = scanner.nextLine().trim();
					library.changeTitle(title, newTitle);
				break;
				case 2:
					System.out.print("Enter new author: ");
					author = scanner.nextLine().trim();
					library.changeAuthor(title, author);
				break;
				case 3:
					quantity = inputInt("Enter new quantity: ");
					library.changeQuantity(title, quantity);
				break;
				case 4:
					isExit = true;
				break;
				default:
					System.out.println("Invalid choice");
			}
		}while(!isExit);				
	}
	
	static void updateUser() {
		int choice;
		
		System.out.println("[1] Add user");
		System.out.println("[2] Remove user");
		choice = inputInt("Enter (1-2): ");
		switch(choice) {
			case 1:
				addUser();
			break;
			case 2:
				removeUser();
			break;
			case 3:
				
			break;
			default:
				System.out.println("Invalid choice");
		}		
	}
	
	static void addUser() {
		int choice;
		String name;
		String extra;
		
		System.out.println("[1] Add student");
		System.out.println("[2] Add guest");
		choice = inputInt("Enter (1-2): ");
		switch(choice) {
			case 1:
				System.out.print("Enter name: ");
				name = scanner.nextLine().trim();
				System.out.print("Enter grade: ");
				extra = scanner.nextLine().trim();
				
				library.addUser(name, extra, choice);
			break;
			case 2:
				System.out.print("Enter name: ");
				name = scanner.nextLine().trim();
				System.out.print("Enter reason for visit: ");
				extra = scanner.nextLine().trim();
				
				library.addUser(name, extra, choice);
			break;
			default:
				System.out.println("Invalid choice");
		}
	}
	
	static void removeUser() {
		String name;
		String choice;
		
		name = userIdNameInput("Enter user ID/Name: ");
		if(name == null) return;
		library.searchUser(name).displayInfo();
		System.out.print("Confirm removal (Y/N): ");
		choice = scanner.nextLine().trim().toLowerCase();
		switch(choice) {
			case "y":
				library.removeUser(name);
			break;
			case "n":
				System.out.println("Removal canceled");
			break;
			default:
				System.out.println("Invalid choice");
		}
	}
}
	
/* bugs & improvements
> currently user name and book title input is length-sensitive (means need to enter full user or book name)
> first time trying making the object declaration (Library library) outside of main. To reduce passing it around too much.
> one thing I notice is that I'm doing `if user/book exist` here, then I'm doing it again in Library, which I think is kinda redundant, but rn I've no idea how to write it only once without having user input in Library
> return all books at once. ~~If there's only one book, no need to check for title~~ (scratch this, always check for title in case the users turned the wrong book).
> not sure if I should make a check for duplicate name when adding new user. Because having the same exact name isn't an imposibility after all...'
> I'm forgoing update user for now reason being I'm kinda tired. Maybe I'll add it in the future
*/