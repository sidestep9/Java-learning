import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static String border = "*".repeat(33);
	static String border2 = "–".repeat(25);
	public static void main(String[] args) {
		
		List lists = new List();
		boolean isRunning = true;
		int choice;
		
		lists.addAnimal(new Lion("SIMBA", 8, "LION"));
		lists.addAnimal(new Elephant("BAMBI", 12, "ELEPHANT"));
		lists.addAnimal(new Monkey("GEORGE", 4, "MONKEY"));
		
		
		while(isRunning) {
			System.out.println(border);
			System.out.printf("%23s\n", "ZOO SIMULATOR");
			System.out.println(border);
			System.out.println("[1] VIEW ALL");
			System.out.println("[2] SEARCH ANIMAL");
			System.out.println("[3] UPDATE ANIMAL");
			System.out.println("[4] EXIT");
			System.out.println(border);
			choice = inputInt("ENTER (1-4): ");
			System.out.println(border);
			switch(choice) {
				case 1:
					viewAll(lists);
				break;
				case 2:
					search(lists);
				break;
				case 3:
					update(lists);
				break;
				default:
					System.out.println("INVALID CHOICE");
			}
		}
	sc.close();
	}
	
	static int inputInt(String prompt) {
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextInt()) {
				int num = sc.nextInt();
				sc.nextLine();
				return num;
			}
			else {
				System.out.println("INVALID CHOICE");
				sc.nextLine();
			}
		}
	}
	
	static boolean nameExist(List lists, String name)  {
		for(Animal animal : lists.animals) {
			if(name.equals(animal.name) || name.equals(String.valueOf(animal.id))) return true;
		}
		return false;
	}
	
	static void viewAll(List lists) {
		int i = 1;
		
		System.out.printf("%-4s %-9s %-9s %-4s\n", "ID", "TYPE", "NAME", "AGE");
		for(Animal animal : lists.animals) {
			System.out.printf("%-4s %-9s %-9s %-4s\n", animal.id, animal.type, animal.name, animal.age);
		}
	}
	
	static void search(List lists) {
		String input;
		
		System.out.print("ENTER ID/NAME: ");
		input = sc.nextLine().trim().toUpperCase();
		lists.searchAnimal(input);
	}
	
	static void update(List lists) {
		int choice;
		String name;
		String type;
		int age;
		boolean validYes = false;
		String removal;
		
		System.out.println("[1] ADD ANIMAL");
		System.out.println("[2] REMOVE ANIMAL");
		System.out.println("[3] UPDATE ANIMAL");
		System.out.println(border);
		choice = inputInt("ENTER (1-3): ");
		switch(choice) {
			case 1:
				System.out.print("ENTER NAME: ");
				name = sc.nextLine().toUpperCase().trim();
				System.out.print("ENTER TYPE: ");
				type = sc.nextLine().toUpperCase().trim();
				do {
					age = inputInt("ENTER AGE: ");
					if(age < 0) {
						System.out.println("INVALID AGE");
						continue;
					}
					validYes = true;
				} while(!validYes);
				lists.addAnimal(name, age, type);
			break;
			case 2:
				do {
					System.out.print("ENTER ID/NAME: ");
					name = sc.nextLine().toUpperCase().trim();
					validYes = nameExist(lists, name);
					if(!validYes) {
						System.out.println("ANIMAL NOT FOUND");
					}
				}while(!validYes);
				lists.searchAnimal(name);
				System.out.print("CONFIRM REMOVAL (Y/N): ");
				removal = sc.nextLine().trim().toUpperCase();
				switch(removal) {
					case "Y":
						lists.removeAnimal(name);
					break;
					case "N":
						System.out.println("REMOVAL ABORTED");
					break;
					default:
						System.out.println("INVALID COMMAND");
				}
			break;
			case 3:
				do {
					System.out.print("ENTER ID/NAME: ");
					name = sc.nextLine().toUpperCase().trim();
					validYes = nameExist(lists, name);
					if(!validYes) {
						System.out.println("ANIMAL NOT FOUND");
					}
				}while(!validYes);
				lists.searchAnimal(name);
				updateOption(lists, name);
			break;
			default:
				System.out.println("INVALID CHOICE");
		}
	}
	
	static void updateOption(List lists, String name) {
		int choice;
		String newName;
		int newAge;
		
		System.out.println("[1] UPDATE NAME");
		System.out.println("[2] UPDATE AGE");
		choice = inputInt("ENTER (1-2): ");
		switch(choice) {
			case 1:
				System.out.print("ENTER NEW NAME: ");
				newName = sc.nextLine().trim().toUpperCase();
				lists.updateAnimal(name, newName);
			break;
			case 2:
				do {
					System.out.print("ENTER NEW AGE: ");
					newAge = sc.nextInt();
					sc.nextLine();
					if(newAge < 0) {
						System.out.println("AGE CAN'T BE NEGATIVE");
					}
				}while(newAge < 0);
				lists.updateAnimal(name, newAge);
			break;
			default:
				System.out.println("INVALID CHOICE");
		}
	}
}

/* bugs & improvement
> same name search, if there's more than one similar name, output the following "there are x name," then lists all the animals with the same name, their id, name, type and age. Then prompt the user to choose one with id.
> negatice age check
> I'm verbose as heck
> update animal only consist of name and age, because changing the type means changing the objects class which I've no idea how to do unless I re-add the whole thing'
*/