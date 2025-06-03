
public class AdminHandler {
    
    private Bank bank;
    
    AdminHandler(Bank bank) {
        this.bank = bank;
    }
    
    
    void adminCredential() {
        String userName;
        int pin;
        Account admin;
        
        userName = InputHandler.inputLine("ENTER USERNAME: ");
        pin = InputHandler.inputInt("ENTER PIN: ");
        InputHandler.lineBreak();
        admin = bank.accounts.get(0);//will change later to be more flexible, but for now since there's only one admin I'll just do it like this
        
        if(admin.userName.equals(userName) && admin.pin == pin) {
            adminMenu();
        }
        else {
            System.out.println("WRONG USERNAME/PASSWORD");
            return;
        }
    }
    
    void adminMenu() {
        int choice;
        String target;
        boolean isExit = false;
        
        while(!isExit) {
            System.out.println("[1] SHOW ALL CLIENT");
            System.out.println("[2] SHOW ALL TRANSACTION");
            System.out.println("[3] ADD/REMOVE CLIENT");
            System.out.println("[4] SEARCH CLIENT");
            System.out.println("[5] UPDATE CLIENT INFO");
            System.out.println("[6] EXIT");
            InputHandler.lineBreak();
            choice = InputHandler.inputInt("ENTER (1-6): ");
            InputHandler.lineBreak();
            switch(choice) {
                case 1:
                    bank.showAllClient();
                break;
                case 2:
                    System.out.println("later");
                break;
                case 3:
                    bank.addRemoveClient();
                break;
                case 4:
                    target = InputHandler.inputLine("ENTER ID/USERNAME: ");
                    bank.searchClient(target).displayInfo();
                break;
                case 5:
                    bank.updateClientInfo();
                break;
                case 6:
                    isExit = true;
                break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}