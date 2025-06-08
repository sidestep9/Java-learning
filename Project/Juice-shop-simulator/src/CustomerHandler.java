
public class CustomerHandler {
    MenuUI menuUI = new MenuUI();
    CustomerLogic customerLogic;
    JuiceLogic juiceLogic;
    
    CustomerHandler(JuiceLogic juiceLogic) {
        this.juiceLogic = juiceLogic;
        this.customerLogic = new CustomerLogic(juiceLogic);
    }
    
    void menu() {
        int choice;
        boolean isExit = false;
        
        do {
            menuUI.divider();
            choice = menuUI.showMenu("=== CUSTOMER MENU ===",
                                     "Enter choice: ",
                                     "[1] Show all juices",
                                     "[2] Add item",
                                     "[3] Remove item",
                                     "[4] Show cart",
                                     "[5] Checkout",
                                     "[6] Exit");
            switch(choice) {
                case 1:
                    juiceLogic.showJuice();
                break;
                case 2:
                    addItem();
                break;
                case 3:
                    removeItem();
                break;
                case 4:
                    customerLogic.showCart();
                break;
                case 5:
                    checkout();
                break;
                case 6:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    
    void addItem() {
        String target;
        target = InputHandler.inputName("Enter name: ");
        customerLogic.addItem(target);
    }
    void removeItem() {
        String target;
        target = InputHandler.inputName("Enter name: ");
        customerLogic.removeItem(target);
    }
    
    void checkout() {
        customerLogic.checkout();
        // confirmation
        System.out.println("Thank you for your purchase!");
    }
}