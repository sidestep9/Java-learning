public class Owner {
	String name;
	int age;
	boolean petYes;
	Pet adoptedPet;
	
	Owner(String name, int age, boolean petYes) {
		this.name = name;
		this.age = age;
		this.petYes = petYes;
	}
	
	void adopt(Pet pet) {
		System.out.println(name + " wants to adopt " + pet.name);
		if(!petYes) {
			System.out.println(name + " adopted " + pet.name + ". They both look happy");
			petYes = true;
			adoptedPet = pet
		}
		else {
			System.out.println(name + " can't adopt " + pet.name + " because she already have a pet.");
		}
	}
	
	void giveUpPet() {
		System.out.println(name + " decided to return " + petName + " because she got bored.");
		petYes = false;
		adoptedPet = null;
	}
}