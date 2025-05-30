import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static String border = "******************************";
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		boolean exitYes = false;
		
		inventory.addItem(new Item("CHICKEN", 9.99, 10));
		
		do {
			System.out.println(border);
			System.out.println("SHOP INVENTORY SIMULATOR");
			System.out.println(border);
			System.out.println("ITEM LIST\n");
			System.out.printf("%-15s %-9s %-9s\n", "NAME", "PRICE", "QUANTITY");
		for(Item item : inventory.items) {
			System.out.printf("%-15s $%-9.2f %-9d\n", item.name, item.price, item.quantity);
		}
		System.out.println(border);
		System.out.println("[1] ADD/REMOVE ITEMS");
		System.out.println("[2] UPDATE ITEMS");
		System.out.println("[3] EXIT");
		System.out.println(border);
		switch(choice("ENTER (1-3): ")) {
			case 1:
				addRemoveItem(inventory);
			break;
			case 2:
				updateItem(inventory);
			break;
			case 3:
				exitYes = true;
			break;
			default:
				System.out.println("INVALID INPUT");
		}
		} while(!exitYes);
		
		System.out.println(border);
		System.out.println("GOODBYE, HAVE A NICE DAY!");
		System.out.println(border);
		
		sc.close();
	}
	
	static int choice(String prompt) {
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextInt()) {
				return sc.nextInt();
			}
			else {
				System.out.println("INVALID INPUT");
				sc.nextLine();
			}
		}
	}
	
	static double getPrice(String prompt) {
		double value;
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextDouble()) {
				value = sc.nextDouble();
				sc.nextLine();
				if(value >= 0) return value;
				else System.out.println("PRICE CAN'T BE NEGATIVE");
			}
			else {
				System.out.println("INVALID INPUT");
				sc.nextLine();
			}
		}
	}
	
	static int getStock(String prompt) {
		int value;
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextInt()) {
				value = sc.nextInt();
				sc.nextLine();
				if(value >= 0) return value;
				else System.out.println("QUANTITY CAN'T BE NEGATIVE");
			}
			else {
				System.out.println("INVALID INPUT");
				sc.nextLine();
			}
		}
	}
	
	static String enterName() {
		String name;
		sc.nextLine();
		
		System.out.print("ENTER ITEM NAME: ");
		name = sc.nextLine().trim().toUpperCase();
		
		return name;
	}
	
	static boolean nameCheck(Inventory inv, String name) {
		
		for(Item item : inv.items) {
			if(item.name.equals(name)) return true;
		}
		return false;
	}
	
	static void addRemoveItem(Inventory inventory) {
		String name;
		double price;
		int stock;
		int choice;
		
		System.out.println(border);
		System.out.println("[1] ADD ITEM");
		System.out.println("[2] REMOVE ITEM");
		System.out.println(border);
		choice = choice("ENTER (1-2): ");
		if(choice > 2) {
			System.out.println("INVALID INPUT");
			return;
		}
		name = enterName();
		if(!nameCheck(inventory, name) && choice == 1) {
					price = getPrice("ENTER PRICE: ");
					stock = getStock("ENTER STOCK: ");
				
					inventory.addItem(new Item(name, price, stock));
		}
		else if(choice == 2) {
			inventory.removeItem(name);
		}
		else {
			System.out.println("ITEM ALREADY EXIST");
		}
	}
	
	static void updateItem(Inventory inventory) {
		String name;
		double price;
		int stock;
		int choice;
		
		System.out.println(border);
		System.out.println("[1] UPDATE PRICE");
		System.out.println("[2] UPDATE QUANTITY");
		System.out.println(border);
		choice = choice("ENTER (1-2): ");
		if(choice > 2) {
			System.out.println("INVALID INPUT");
			return;
		}
		name = enterName();
		if(nameCheck(inventory, name)) {
			switch(choice) {
				case 1:
					price = getPrice("ENTER NEW PRICE: ");
					inventory.updatePrice(name, price);
				break;
				case 2:
					stock = getStock("ENTER NEW QUANTITY: ");
					inventory.updateStock(name, stock);
				break;
				default:
					System.out.println("INVALID INPUT");
			}
		}
		else {
			System.out.println("ITEM DOES NOT EXIST");
		}
	}
}

/* bugs & improvements
> add item: entering the price and stock before checking if the item exist is redundant. But idk how to enter it after checking without it needing to have user input in Inventory class--> solved
> update price & stock: same issue as above--> solved
> check for negative price and item input --> done
*/