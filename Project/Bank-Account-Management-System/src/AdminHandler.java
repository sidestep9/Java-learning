
public class AdminHandler {
    
    private AccountHandler accountHandler;
    private Admin admin;
    AdminService adminService;
    
    AdminHandler(AccountHandler accountHandler) {
        this.accountHandler = accountHandler;
        this.adminService = new AdminService(accountHandler);
    }
    
    
    void adminCredential() {
        String userName;
        int pin;
        Account account;
        
        userName = InputHandler.inputLine("ENTER USERNAME: ");
        pin = InputHandler.inputInt("ENTER PIN: ");
        InputHandler.lineBreak();
        account = accountHandler.searchClient(userName);
        this.admin = (Admin) account;
        
        if(admin == null || !admin.userName.equals(userName) && admin.pin != pin) {
          System.out.println("WRONG USERNAME/PIN");
          return;
        }
        adminMenu();
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
          adminService.showAllClient();
        break;
        case 2:
          adminService.showAllTransaction();
        break;
        case 3:
          addRemoveClient();
        break;
        case 4:
          target = InputHandler.inputLine("ENTER ID/USERNAME: ");
          accountHandler.searchClient(target).displayInfo();
        break;
        case 5:
          updateClientInfo();
        break;
        case 6:
          isExit = true;
        break;
        default:
          System.out.println("INVALID CHOICE");
      }
    }
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
        case 2:
          removeClient();
        break;
        case 3:
          isExit = true;
        break;
        default:
          System.out.println("INVALID CHOICE");
      }
    }while(!isExit);
  }
  void addClient() {
    String fullName;
    String userName;
    int pin;
    boolean invalid = false;
    
    fullName = InputHandler.inputLine("ENTER FULL NAME: ");
    do {
     userName = InputHandler.inputLine("ENTER USERNAME: ");
     if(!adminService.userNameValid(userName)) {
       invalid = true;
     }
    }while(invalid);
    do {
      pin = InputHandler.inputInt("ENTER PIN (6-DIGIT): ");
    }while(!adminService.pinValid(pin));
    adminService.addClient(fullName, userName, pin);
  }
  void removeClient() {
    String target;
    String confirm;
    Account client;
    
    target = InputHandler.inputLine("ENTER ID/USERNAME: ");
    InputHandler.lineBreak();
    client = accountHandler.searchClient(target);
    if(accountHandler.clientNull(client)) {
      InputHandler.lineBreak();
      return;
    }
    confirm = InputHandler.inputLine("CONFIRM REMOVAL (Y/N): ").toLowerCase();
    System.out.println();
    if(adminService.confirmation(confirm)) {
      adminService.removeClient(client);
    }
    InputHandler.lineBreak();
  }
  
  void updateClientInfo() {
    String target;
    int choice;
    Account client;
    
    target = InputHandler.inputLine("ENTER ID/USERNAME: ");
    InputHandler.lineBreak();
    client = accountHandler.searchClient(target);
    if(client == null) {
      System.out.println("USER NOT FOUND");
      return;
    }
    InputHandler.lineBreak();
    client.displayInfo();
    InputHandler.lineBreak();
    System.out.println("[1] EDIT FULL NAME");
    System.out.println("[2] EDIT USERNAME");
    System.out.println("[3] EDIT PIN");
    System.out.println("[4] EDIT BALANCE");
    InputHandler.lineBreak();
    choice = InputHandler.inputInt("ENTER (1-4): ");
    InputHandler.lineBreak();
    switch(choice) {
      case 1:
        editFullName(client);
      break;
      case 2:
        editUserName(client);
      break;
      case 3:
        editPin(client);
      break;
      case 4:
        editBalance(client);
      break;
      default:
        System.out.println("INVALID CHOICE");
    }
  }
  void editFullName(Account client) {
    String newName;
    newName = InputHandler.inputLine("ENTER NEW FULL NAME: ");
    InputHandler.lineBreak();
    adminService.editFullName(client, newName);
    InputHandler.lineBreak();
  }
  void editUserName(Account client) {
    String newUserName;
    newUserName = InputHandler.inputLine("ENTER NEW USERNAME: ");
    InputHandler.lineBreak();
    adminService.editUserName(client, newUserName);
    InputHandler.lineBreak();
  }
  void editPin(Account client) {
    int newPin;
    newPin = InputHandler.inputInt("ENTER NEW PIN (6-DIGIT): ");
    InputHandler.lineBreak();
    adminService.editPin(client, newPin);
    InputHandler.lineBreak();
  }
  void editBalance(Account client) {
    double newBalance;
    newBalance = InputHandler.inputDouble("ENTER NEW BALANCE: ");
    InputHandler.lineBreak();
    adminService.editBalance(client, newBalance);
    InputHandler.lineBreak();
  }
}