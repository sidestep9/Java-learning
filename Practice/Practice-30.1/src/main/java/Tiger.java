public class Tiger extends Animal {
	
	Tiger(String type, String name, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		isCarnivore = true;
	}
	
	void sound() { 
		System.out.println(name + " the tiger roars");
	}
}