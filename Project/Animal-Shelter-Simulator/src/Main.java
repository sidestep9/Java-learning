
public class Main {
    
    public static void main(String[] args) {
        MenuUI menuUI = new MenuUI();
        Shelter shelter = new Shelter();
        int choice;
        boolean isExit = false;
        
       shelter.tempAnimals();
        
        do {
            menuUI.divider();
            choice = menuUI.showMenu("=== SHELTER SIMULATOR ===",
                                     "ENTER (1-6): ",
                                     "[1] VIEW ALL ANIMALS",
                                     "[2] FEED ALL ANIMALS",
                                     "[3] MAKE ALL ANIMALS SOUND",
                                     "[4] ADOPT ANIMAL",
                                     "[5] ADD ANIMAL",
                                     "[6] EXIT");
            menuUI.divider();
            switch(choice) {
                case 1:
                    shelter.viewAnimals();
                break;
                case 2:
                    shelter.feedAnimals();
                break;
                case 3:
                    shelter.soundAnimals();
                break;
                case 4:
                    shelter.adoptAnimal();
                break;
                case 5:
                    shelter.addAnimal();
                break;
                case 6:
                    isExit = true;
                break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }while(!isExit);
        
        System.out.println("GOODBYE AND HAVE A NICE DAY");
    }
    
}