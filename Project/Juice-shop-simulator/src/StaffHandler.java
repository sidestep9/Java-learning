import java.util.ArrayList;

public class StaffHandler {
    MenuUI menuUI = new MenuUI();
    StaffLogic staffLogic = new StaffLogic();
    JuiceLogic juiceLogic = new JuiceLogic();
    
    void credential() {
        showMenu();
    }
    
    void showMenu() {
        int choice;
        boolean isExit = false;
        
        do {
            menuUI.divider();
            choice = menuUI.showMenu("=== STAFF MENU ===",
                                     "Enter choice: ",
                                     "[1] Show all juices",
                                     "[2] Add juice",
                                     "[3] Remove juice",
                                     "[4] Update juice info",
                                     "[5] Exit");
            switch(choice) {
                case 1:
                    juiceLogic.showJuice();
                break;
                case 2:
                    addJuice();
                break;
                case 3:
                    removeJuice();
                break;
                case 4:
                    updateJuice();
                break;
                case 5:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    
    void addJuice() {
        String name;
        double price;
        ArrayList<String> ingredients = new ArrayList<>();
        
        name = InputHandler.inputName("Enter name: ");
        price = InputHandler.inputDouble("Enter price: ");
        ingredients = InputHandler.inputTexts("Enter ingredients: ");
        
        staffLogic.addJuice(name, price, ingredients);
    }
    void removeJuice() {
        String name;
        String confirmation;
        Juice juice;
        
        name = InputHandler.inputName("Enter juice name: ");
        juice = juiceLogic.searchJuice(name);
        if(juice == null) {
            System.out.println("Not found");
            return;
        }
        confirmation = InputHandler.inputText("Confirm deletion (Y/N): ").toLowerCase();
        switch(confirmation) {
            case "y":
                staffLogic.removeJuice(juice);
            break;
            case "n":
                System.out.println("Deletion cancelled");
            break;
            default:
                System.out.println("Invalid choice. Deletion cancelled");
        }
    }
    
    void updateJuice() {
        int choice;
        boolean isExit = false;
        
        do{
            menuUI.divider();
            choice = menuUI.showMenu("=== JUICE INFO UPDATE MENU ===",
                                     "Enter choice: ",
                                     "[1] Edit name",
                                     "[2] Edit price",
                                     "[3] Exit");
            switch(choice) {
                case 1:
                    editName();
                break;
                case 2:
                    editPrice();
                break;
                case 3:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    void editName() {
        String target;
        String name;
        Juice juice;
        
        target = InputHandler.inputName("Enter name: ");
        juice = juiceLogic.searchJuice(target);
        if(juice == null) {
            System.out.println("Item not found");
            return;
        }
        name = InputHandler.inputName("Enter new name: ");
        staffLogic.editName(juice, name);
    }
    void editPrice() {
        String target;
        int price;
        Juice juice;
        
        target = InputHandler.inputName("Enter name: ");
        juice = juiceLogic.searchJuice(target);
        if(juice == null) {
            System.out.println("Item not found");
            return;
        }
        price = InputHandler.inputInt("Enter new price: ");
        staffLogic.editPrice(juice, price);
    }
}