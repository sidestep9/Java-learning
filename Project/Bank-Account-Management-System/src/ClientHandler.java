
public class ClientHandler {
    
    private AccountHandler accountHandler;
    private Client client;
    ClientService clientService;
    
    ClientHandler(AccountHandler accountHandler) {
        this.accountHandler = accountHandler;
        this.clientService = new ClientService(accountHandler);
    }
    
    void clientCredential() {
        String userName;
        int pin;
        
        userName = InputHandler.inputLine("ENTER USERNAME: ");
        pin = InputHandler.inputInt("ENTER PIN: ");
        InputHandler.lineBreak();
        this.client = (Client) accountHandler.searchClient(userName);//this still apply by using ID
        clientService.currentClient(client);
        
        if(client == null || !client.userName.equals(userName) || client.pin != pin) {
            System.out.println("WRONG USERNAME/PIN");
            return;
        }
        else {
            System.out.println("WELCOME " + client.fullName);
            InputHandler.lineBreak();
            clientService.currentClient(client);
            clientMenu();
        }
    }
    
    void clientMenu() {
        int choice;
        boolean isExit = false;
        
        client.displayInfo();
        InputHandler.lineBreak();
        
        do {
            choice = MenuUtils.showMenu("=== CLIENT MENU ===",
                                        "ENTER (1-6): ",
                                        "[1] SHOW BALANCE", 
                                        "[2] DEPOSIT", 
                                        "[3] WITHDRAW", 
                                        "[4] TRANSFER",
                                        "[5] TRANSACTION HISTORY", 
                                        "[6] EXIT");
            InputHandler.lineBreak();
            switch(choice) {
                case 1:
                    System.out.println("BALANCE: " + client.balance);
                    InputHandler.lineBreak();
                break;
                case 2:
                    deposit();
                break;
                case 3:
                    withdraw();
                break;
                case 4:
                    transfer();
                break;
                case 5:
                    for(Record record : client.records) {
                      record.showRecord();
                      System.out.println();
                    }
                break;
                case 6:
                    this.client = null;
                    System.out.println("SUCCESSFULLY LOGGED OUT");
                    isExit = true;
                break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }while(!isExit);
    }
    
    void deposit() {
      double sum;
      sum = InputHandler.inputDouble("ENTER AMOUNT: ");
      InputHandler.lineBreak();
      clientService.deposit(sum);
      InputHandler.lineBreak();
    }
    void withdraw() {
      double sum;
      sum = InputHandler.inputDouble("ENTER AMOUNT: ");
      InputHandler.lineBreak();
      clientService.withdraw(sum);
      InputHandler.lineBreak();
    }
    void transfer() {
      double sum;
      String target;
      Client targetClient;
      
      target = InputHandler.inputLine("ENTER TARGET ID/USERNAME: ");
      InputHandler.lineBreak();
      targetClient = (Client) accountHandler.searchClient(target);
      sum = InputHandler.inputDouble("ENTER TRANSFER AMOUNT: ");
      InputHandler.lineBreak();
      clientService.transfer(sum, targetClient);
      InputHandler.lineBreak();
    }
}