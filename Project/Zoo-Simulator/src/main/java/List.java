import java.util.ArrayList;

public class List {
	
	ArrayList<Animal> animals = new ArrayList<>();
	
	void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	void addAnimal(String name, int age, String type) {
		if(type.equalsIgnoreCase("lion")) {
			animals.add(new Lion(name, age, type));
			System.out.println("ANIMAL ADDED");
		}
		else if(type.equalsIgnoreCase("elephant")) {
			animals.add(new Elephant(name, age, type));
			System.out.println("ANIMAL ADDED");
		}
		else if(type.equalsIgnoreCase("monkey")) {
			animals.add(new Monkey(name, age, type));
			System.out.println("ANIMAL ADDED");
		}
		else {
			System.out.println("THAT TYPE OF ANIMAL DOESN'T EXIST");
		}
	}
	
	void removeAnimal(String name) {
		for(Animal animal : animals) {
			if(name.equals(animal.name) || name.equals(String.valueOf(animal.id))) {
				animals.remove(animal);
				System.out.println("ANIMAL REMOVED");
				break;
			}
		}
	}
	
	void searchAnimal(String input) {
		for(Animal animal : animals) {
			if(input.equals(animal.name) || input.equals(String.valueOf(animal.id))) {
				animal.displayInfo();
				return;
			}
		}
		System.out.println("ANIMAL NOT FOUND");
	}
	
	void updateAnimal(String name, String newName) {
		for(Animal animal : animals) {
			if(name.equals(animal.name) || name.equals(String.valueOf(animal.id))) {
				animal.name = newName;
				System.out.println("NAME UPDATED");
				break;
			}
		}
	}
	
	void updateAnimal(String name, int newAge) {
		for(Animal animal : animals) {
			if(name.equals(animal.name) || name.equals(String.valueOf(animal.id))) {
				animal.age = newAge;
				System.out.println("AGE UPDATED");
				break;
			}
		}
	}
}