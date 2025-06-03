
public class ClientHandler {
    
    private Bank bank;
    private Client client;
    
    ClientHandler(Bank bank) {
        this.bank = bank;
    }
    
    void clientCredential() {
        String username;
        int pin;
        
        username = InputHandler.inputLine("ENTER USERNAME: ");
        pin = InputHandler.inputInt("ENTER PIN: ");
        this.client = (Client) bank.searchClient(username);
        
        if(client == null || client.pin != pin) {
            System.out.println("WRONG USERNAME/PIN");
            return;
        }
        else {
            System.out.println("WELCOME " + client.fullName);
            clientMenu();
        }
    }
    
    void clientMenu() {
        int choice;
        boolean isExit = false;
        
        do {
            System.out.println("[1] SHOW BALANCE");
            System.out.println("[2] DEPOSIT");
            System.out.println("[3] WITHDRAW");
            System.out.println("[4] TRANSFER");
            System.out.println("[5] TRANSACTION HISTORY");
            System.out.println("[6] LOG OUT");
            InputHandler.lineBreak();
            choice = InputHandler.inputInt("ENTER (1-6): ");
            switch(choice) {
                case 1:
                    System.out.println("BALANCE: " + client.balance);
                break;
                case 2:
                    bank.clientDeposit(client);
                break;
                case 3:
                    bank.clientWithdraw(client);
                break;
                case 4:
                    bank.clientTransfer(client);
                break;
                case 5:
                    for(Record record : client.records) {
                      record.showRecord();
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
}