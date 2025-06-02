public class Animal {
	int id;
	static int count = 1;
	String name;
	int age;
	String type;
	String diet;
	
	Animal(String name, int age, String type) {
		this.id = count++;
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	void displayInfo() {
		System.out.printf("%-5s: %s\n", "NAME", name);
		System.out.printf("%-5s: %s\n", "AGE", age);
		System.out.printf("%-5s: %s\n", "TYPE", type);
		System.out.printf("%-5s: %s\n", "DIET", diet);
	}
}