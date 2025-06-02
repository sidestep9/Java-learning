import java.util.ArrayList;

public class Bank {
    
    ArrayList<Account> accounts = new ArrayList<>();
    ArrayList<Record> records = new ArrayList<>();
    
    void addAdminTemporary(){
        accounts.add(new Admin("MR.POTATO", "chips9", 123456));
        System.out.println("Added admin! account size: " + accounts.size());
    }
    
    Account searchClient(String input) {
        for(Account account : accounts) {
            if(account.userName.equals(input) || input.equals(String.valueOf(account.id))) {
                return account;
            }
        }
        return null;
    }
    
    
    void addRemoveClient() {
        int choice;
        boolean isExit = false;
        
        do {
            System.out.println("[1] ADD NEW CLIENT");
            System.out.println("[2] REMOVE CLIENT");
            System.out.println("[3] EXIT");
            InputHandler.lineBreak();
            choice = InputHandler.inputInt("ENTER (1-3): ");
            InputHandler.lineBreak();
            switch(choice) {
                case 1:
                    addClient();
                break;
                case 3:
                    isExit = true;
                break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }while(!isExit);
    }
    
    void addClient(Client client) {
        accounts.add(client);
    }
    
    void addClient() {
        String fullName;
        String userName;
        int pin;
        Account account;
        
        fullName = InputHandler.inputLine("ENTER FULL NAME: ");
        do {
            userName = InputHandler.inputLine("ENTER USERNAME: ");
            account = searchClient(userName);
            if(userName.length() < 6) {
                System.out.println("USERNAME IS TOO SHORT");
            }
            else if(userName.length() > 12) {
                System.out.println("USERNAME IS TOO LONG");
            }
            else if(account != null) {
                System.out.println("USERNAME ALREADY EXIST");
            }
        }while(userName.length() < 6 || userName.length() > 12 || account != null);
        do {
            pin = InputHandler.inputInt("ENTER PIN (6-DIGIT): ");
            if(String.valueOf(pin).length() != 6) {
                System.out.println("PIN MUST BE 6-DIGIT");
            }
        }while(String.valueOf(pin).length() != 6);
        accounts.add(new Client(fullName, userName, pin));
        System.out.println();
        System.out.println("CLIENT ADDED");
        InputHandler.lineBreak();
    }
    
    void removeClient() {
        
    }
    
    void showAllClient() {
        for(Account account : accounts) {
            account.displayInfo();
            System.out.println();
        }
    }
    
    void editFullName(Account acc, String newFullName) {
        acc.fullName = newFullName;
        System.out.println("NAME CHANGED");
    }
    
    void editUserName(Account acc, String newUserName) {
        acc.userName = newUserName;
        System.out.println("USERNAME CHANGED");
    }
    
    void editUserPin(Account acc, int newPin) {
        acc.pin = newPin;
        System.out.println("PIN CHANGED");
    }
}