import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// var decl
		String[] itemLists = new String[5];
		int inputOption;
		int[] quantity = new int[5];
		boolean isExit = false;
		
		Arrays.fill(itemLists, "EMPTY");
		Arrays.fill(quantity, 0);
		
		// menu
		while(!isExit) {
			System.out.println("**************");
			System.out.println("LIMITED INVENTORY SIMULATOR");
			System.out.println("**************");
			System.out.println("[1] VIEW");
			System.out.println("[2] SEARCH");
			System.out.println("[3] UPDATE");
			System.out.println("[4] EXIT");
			System.out.println("**************");
			System.out.print("ENTER OPTION (1-4): ");
			inputOption = scanner.nextInt();
			scanner.nextLine();
			System.out.println("**************");
			switch(inputOption) {
				case 1:
					view(itemLists, quantity);
				break;
				case 2:
					search(itemLists, quantity);
				break;
				case 3:
					updateOptions(itemLists, quantity);
				break;
				case 4:
					isExit = true;
				break;
				default:
					System.out.println("INVALID OPTION");
			}
		}
		
		if(isExit) {
			System.out.println("THANK YOU! HAVE A NICE DAY!");
		}
		
		// add item
		// add quantity
		// remove item
	}
	
	static String capitalize(String cap) {
		return cap.substring(0, 1).toUpperCase() + cap.substring(1).toLowerCase();
	}
	
	static void view(String[] items, int[] quantity) {
		int num = 0;
		for(String item : items) {
			num++;
			System.out.printf("[%d. %s]", num, item);
		}
		System.out.println();
		num = 0;
		for(int quant : quantity) {
			num++;
			System.out.printf("[%d. %s]", num, quant);
		}
		System.out.println();
	}	
	
	static void search(String[] items, int[] quantity) {
		
		String target;
		boolean found = false;
		
		System.out.print("ENTER ITEM NAME:  ");
		target = scanner.nextLine().trim().toLowerCase();
		
		for(int i = 0; i < items.length; i++) {
			if(items[i].toLowerCase().equals(target)) {
				System.out.println("ITEM: " + items[i] + " | QUANTITY: " + quantity[i]);
				found = true;
				break;
			}			
		}
		
		if(!found) {
			System.out.println("ITEM NOT FOUND");
		}
	}
	
	static void updateOptions(String[] items, int[] quantity) {
		int choose;
		int result;
		
		System.out.println("[1. ADD/REMOVE ITEM]");
		System.out.println("[2. ADD/REMOVE QUANTITY]");
		System.out.println("**************");
		System.out.print("ENTER YOUR CHOICE: ");
		choose = scanner.nextInt();
		scanner.nextLine();
		
		if(choose == 1) {
			addRemoveItem(items, quantity);
		}
		else if(choose == 2) {
			result = addRemoveQuantity(items, quantity);
			if(result == 0) {
				System.out.println("INVALID OPTION");
			}
			else if(result == 1) {
				System.out.println("AMOUNT CAN'T BE NEGATIVE");
			}
			else if(result == 2) {
				System.out.println("AMOUNT CAN'T BE MORE THAN QUANTITY");
			}
		}
		else {
			System.out.println("INVALID OPTION");
		}
	}
	
	static String addRemoveItem(String[] items, int[] quantity) {
		
		String name;
		int choose;
		
		System.out.print("");
		
		System.out.println("[1. ADD]");
		System.out.println("[2. REMOVE]");
		System.out.println("**************");
		System.out.print("CHOOSE OPTION: ");
		choose = scanner.nextInt();
		scanner.nextLine();
		
		if(choose == 1) {		
			System.out.print("ENTER ITEM NAME: ");
			name = scanner.nextLine();
			name = capitalize(name);
		
			for(int i = 0; i < items.length; i++) {
				if(items[i].equals("EMPTY") || items[i] == null) {
				items[i] = name;
				return items[i];	
				}
			}
			return "INVENTORY FULL";
		}
		else if(choose == 2) {
			System.out.print("ENTER ITEM NAME: ");
			name = scanner.nextLine();
			
			for(int j = 0; j < items.length; j++) {
				if(items[j].equalsIgnoreCase(name)) {
					items[j] = "EMPTY";
					return items[j];
				}
			}
			return "ITEM NOT FOUND";
		}
		else {
			return "INVALID OPTION";
		}	
	}
	
	static int addRemoveQuantity(String[] items, int[] quantity) {
		
		int choose;
		String name;
		int amount;
		int num = 0;
		
		System.out.println();
		
		System.out.println("[1. ADD]");
		System.out.println("[2. REMOVE]");
		System.out.println("**************");
		System.out.print("CHOOSE OPTION: ");
		choose = scanner.nextInt();
		scanner.nextLine();
		
		if(choose == 1) {
			for(String item : items) {
				num++;
				System.out.printf("[%d. %s]", num, item);
			}
			System.out.println();
			num = 0;
			for(int quant : quantity) {
				num++;
				System.out.printf("[%d. %d]", num, quant);
			}
		
			System.out.println();
			System.out.print("CHOOSE WHICH ITEM: ");
			name = scanner.nextLine();
		
			for(int i = 0; i < items.length; i++) {
				if(items[i].equalsIgnoreCase(name)) {
					System.out.print("ENTER THE AMOUNT: ");
					amount = scanner.nextInt();
					scanner.nextLine();
					if(amount < 0) {
						return 1;
					}
					return quantity[i] += amount;
				}
			}
			return 0;
		}
		else if(choose == 2) {
			for(String item : items) {
				num++;
				System.out.printf("[%d. %s]", num, item);
			}
			System.out.println();
			num = 0;
			for(int quant : quantity) {
				num++;
				System.out.printf("[%d. %d]", num, quant);
			}
		
			System.out.println();
			System.out.print("CHOOSE WHICH ITEM: ");
			name = scanner.nextLine();
		
			for(int i = 0; i < items.length; i++) {
				if(items[i].equalsIgnoreCase(name)) {
					System.out.print("ENTER THE AMOUNT: ");
					amount = scanner.nextInt();
					scanner.nextLine();
					if(amount < 0) {
						return 1;
					}
					else if(quantity[i] < amount) {
						return 2;
					}
					return quantity[i] -= amount;
				}
			}
			return 0;
		}
		return 0;		
	}
}

/* bugs and improvement
> make table for better readability (idk how)
> addRemoveItem doesn't print return "..." (I found a work around by doing the same thing with addRemoveQuantity, but it's kinda verbose. I'll do that if there's no other way')
> remove quantity when removing items (how?)
> wait, can I insert two arrays in enhances for loop?
*/

// Man, I wish I could collapse the code... scrolling through all this is painful
