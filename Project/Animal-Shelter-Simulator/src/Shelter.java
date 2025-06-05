import java.util.ArrayList;

public class Shelter {
    
    ArrayList<Animal> animals = new ArrayList<>();
    MenuUI menuUI = new MenuUI();
    
    Animal searchAnimal(String name) {
        for(Animal animal : animals) {
            if(animal.name.equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }
    
    void tempAnimals() {
        animals.add(new Cat("Cat", "Luna", 4));
        animals.add(new Dog("Dog", "Maxine", 6));
        animals.add(new Parrot("Bird", "Squealer", 2));
    }
    
    void viewAnimals() {
        if(animals.size() == 0) {
            System.out.println("THERE IS NO ANIMAL");
            return;
        }
        for(Animal animal : animals) {
            menuUI.separator();
            animal.displayInfo();
            menuUI.separator();
        }
    }
    
    void feedAnimals() {
        if(animals.size() == 0) {
            System.out.println("THERE IS NO ANIMAL");
            return;
        }
        for(Animal animal : animals) {
            menuUI.separator();
            animal.feed();
            menuUI.separator();
        }
    }
    void soundAnimals() {
        if(animals.size() == 0) {
            System.out.println("THERE IS NO ANIMAL");
            return;
        }
        for(Animal animal : animals) {
            menuUI.separator();
            animal.sound();
            menuUI.separator();
        }
    }
    
    void adoptAnimal() {
        String target;
        Animal animal;
        
        target = InputUtil.inputLine("ENTER ANIMAL NAME: ");
        menuUI.divider();
        animal = searchAnimal(target);
        if(animal == null) {
            System.out.println("NOT FOUND");
            return;
        }
        animal.displayInfo();
        animals.remove(animal);
        System.out.println();
        System.out.println("ANIMAL ADPOTED");
    }
    
    void addAnimal() {
        String species;
        String name;
        int age;
        
        name = InputUtil.inputLine("ENTER NAME: ");
        species = InputUtil.inputLine("ENTER SPECIES: ");
       /* if(searchAnimal(name).name.equalsIgnoreCase(name) && searchAnimal(name).species.equalsIgnoreCase(species)) {
            System.out.println("ANIMAL ALREADY EXIST");
            return;
        } was gonna check for duplicates but maybe no need*/
        age = InputUtil.inputInt("ENTER AGE: ");
        
        animals.add(new Cat(species, name, age));// I'm too lazy to make a full species check, can change it when I'm not too lazy. It's a practice project anw
        System.out.println("NEW ANIMAL ADDED");
    }
}