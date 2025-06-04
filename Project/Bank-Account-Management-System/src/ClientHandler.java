
public class ClientHandler {
    
    private AccountHandler accountHandler;
    private Client client;
    ClientService clientService;
    
    ClientHandler(AccountHandler accountHandler) {
        this.accountHandler = accountHandler;
        this.clientService = new ClientService(accountHandler);
    }
    
    void clientCredential() {
        String username;
        int pin;
        
        username = InputHandler.inputLine("ENTER USERNAME: ");
        pin = InputHandler.inputInt("ENTER PIN: ");
        this.client = (Client) accountHandler.searchClient(username);
        clientService.currentClient(client);
        
        if(client == null || client.pin != pin) {
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
            System.out.println("[1] SHOW BALANCE");
            System.out.println("[2] DEPOSIT");
            System.out.println("[3] WITHDRAW");
            System.out.println("[4] TRANSFER");
            System.out.println("[5] TRANSACTION HISTORY");
            System.out.println("[6] LOG OUT");
            InputHandler.lineBreak();
            choice = InputHandler.inputInt("ENTER (1-6): ");
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
      if(sum > client.balance) {
        System.out.println("INSUFFICIENT BALANCE");
        InputHandler.lineBreak();
        return;
      }
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
      if(accountHandler.clientNull(targetClient)) {
        InputHandler.lineBreak();
        return;
      }
      targetClient.summary();
      InputHandler.lineBreak();
      if(client == targetClient) {
        System.out.println("CANNOT TRANSFER TO SELF");
        InputHandler.lineBreak();
        return;
      }
      sum = InputHandler.inputDouble("ENTER TRANSFER AMOUNT: ");
      InputHandler.lineBreak();
      if(sum > client.balance) {
        System.out.println("INSUFFICIENT BALANCE");
        InputHandler.lineBreak();
        return;
      }
      clientService.transfer(sum, targetClient);
      InputHandler.lineBreak();
    }
}