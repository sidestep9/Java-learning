public class Main {
	public static void main(String[] args) {
		
		Pet pet1 = new Pet("Carla", "Cat", 3);
		
		Owner owner1 = new Owner("Leslie", 28, false);
		
		pet1.displayInfo();
		
		owner1.adopt(pet1);
		
		owner1.giveUpPet();
	}
}