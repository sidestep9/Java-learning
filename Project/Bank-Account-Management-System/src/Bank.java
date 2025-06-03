import java.util.ArrayList;

public class Bank {
    
    ArrayList<Account> accounts = new ArrayList<>();
    
    // ADMIN STUFF
    
    void addAdminTemporary(){
        accounts.add(new Admin("MR.POTATO", "chips9", 123456));
        System.out.println("Added admin! account size: " + accounts.size());
    }
    
    void addClientTemporary(){
        accounts.add(new Client("SPONGEBOB", "square1", 123456));
        accounts.add(new Client("PATRICK", "star2", 123456));
        accounts.add(new Client("SQUIDWARD", "tent3", 123456));
        System.out.println("Added client! account size: " + accounts.size());
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
    
    void addClient(Client client) {
        accounts.add(client);
    }
    
    void addClient() {
        String fullName;
        String userName;
        int pin;
        Account acc;
        
        fullName = InputHandler.inputLine("ENTER FULL NAME: ");
        do {
            userName = InputHandler.inputLine("ENTER USERNAME: ");
            acc = searchClient(userName);
            if(userName.length() < 6) {
                System.out.println("USERNAME IS TOO SHORT");
            }
            else if(userName.length() > 12) {
                System.out.println("USERNAME IS TOO LONG");
            }
            else if(acc != null) {
                System.out.println("USERNAME ALREADY EXIST");
            }
        }while(userName.length() < 6 || userName.length() > 12 || acc != null);
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
        String target;
        String confirmation;
        Account acc;
        
        target = InputHandler.inputLine("ENTER ID/USERNAME: ");
        acc = searchClient(target);
        if(acc == null) {
            System.out.println("CLIENT NOT FOUND");
            return;
        }
        acc.displayInfo();
        System.out.println();
        confirmation = InputHandler.inputLine("CONFIRM REMOVAL (Y/N): ").toLowerCase();
        System.out.println();
        switch(confirmation) {
            case "y":
                accounts.remove(acc);
                System.out.println("CLIENT REMOVED");
            break;
            case "n":
                System.out.println("REMOVAL CANCELED");
            break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
    
    void showAllClient() {
        for(Account acc : accounts) {
            acc.displayInfo();
            System.out.println();
        }
    }
    
    void updateClientInfo() {
        String target;
        int choice;
        Account acc;
        String newName;
        String newUserName;
        int newPin;
        double newBalance;
        
        target = InputHandler.inputLine("ENTER ID/USERNAME: ");
        acc = searchClient(target);
        if(acc == null) {
            System.out.println("USER NOT FOUND");
            return;
        }
        System.out.println("[1] EDIT FULL NAME");
        System.out.println("[2] EDIT USERNAME");
        System.out.println("[3] EDIT PIN");
        System.out.println("[4] EDIT BALANCE");
        choice = InputHandler.inputInt("ENTER (1-4): ");
        switch(choice) {
            case 1:
                newName = InputHandler.inputLine("ENTER NEW FULL NAME: ");
                editFullName(acc, newName);
            break;
            case 2:
                newUserName = InputHandler.inputLine("ENTER NEW USERNAME (6-12 characters): ");
                if(newUserName.length() < 6) {
                    System.out.println("USERNAME IS TOO SHORT");
                    break;
                }
                else if(newUserName.length() > 12) {
                    System.out.println("USERNAME IS TOO LONG");
                    break;
                }
                editUserName(acc, newUserName);
            break;
            case 3:
                newPin = InputHandler.inputInt("ENTER PIN (6-DIGIT): ");
                if(String.valueOf(newPin).length() != 6) {
                    System.out.println("PIN MUST BE 6-DIGIT");
                    break;
                }
                editUserPin(acc, newPin);
            break;
            case 4:
                newBalance = InputHandler.inputDouble("ENTER NEW BALANCE: ");
                if(newBalance < 0) {
                  System.out.println("INVALID AMOUNT");
                  break;
                }
                editUserBalance(acc, newBalance);
            break;
            default:
                System.out.println("INVALID CHOICE");
        }
    }
    
    void editFullName(Account acc, String newName) {
        acc.fullName = newName;
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
    
    void editUserBalance(Account acc, double newBalance) {
      Client client = (Client) acc;
      client.balance = newBalance;
      System.out.println("BALANCE UPDATED");
    }
    
    // CLIENT STUFF
    
    void recordAdd(Client client, String cause, double initialBalance, double sum, double finalBalance) {
        client.records.add(new Record(cause, initialBalance, sum, finalBalance));
    }
    
    void clientDeposit(Client client) {
        double sum;
        double initialBalance = client.balance;
        
        sum = InputHandler.inputInt("ENTER DEPOSIT AMOUNT: ");
        if(sum < 1) {
          System.out.println("INVALID AMOUNT");
          return;
        }
        client.balance += sum;
        recordAdd(client, "DEPOSIT", initialBalance, sum, client.balance);
        System.out.println(sum + " DEPOSITED\n");
    }
    
    void clientWithdraw(Client client) {
        double sum;
        double initialBalance = client.balance;
        
        sum = InputHandler.inputInt("ENTER AMOUNT: ");
        if(sum > client.balance) {
          System.out.println("INSUFFICIENT BALANCE");
          return;
        }
        client.balance -= sum;
        recordAdd(client, "WITHDRAWAL", initialBalance, sum, client.balance);
        System.out.println(sum + " WITHDRAWN\n");
    }
    
    void clientTransfer(Client client) {
      String target;
      Client transferTarget;
      double sum;
      double initialBalance = client.balance;
      double targetInitBalance;
      String confirm;
      
      target = InputHandler.inputLine("ENTER TARGET ID/USERNAME: ");
      transferTarget = (Client) searchClient(target);//idk how to solve this one, this is the same as making new client and the client's id will go up, so I'm transfering to someone new rather than someone who already exist.
      if(transferTarget == null) {
        System.out.println("USER NOT FOUND");
        return;
      }
      targetInitBalance = transferTarget.balance;
      sum = InputHandler.inputInt("ENTER AMOUNT: ");
      if(sum < 1) {
        System.out.println("INVALID AMOUNT");
        return;
      }
      else if(sum > client.balance) {
        System.out.println("INSUFFICIENT BALANCE");
        return;
      }
      System.out.println();
      System.out.println("TARGET");
      System.out.println("ID  : " + transferTarget.id);
      System.out.println("NAME: " + transferTarget.fullName);
      System.out.println("TRANSFER AMOUNT: " + sum);
      confirm = InputHandler.inputLine("CONFIRM TRANSFER (Y/N): ").toLowerCase();
      switch(confirm) {
        case "y":
          client.balance -= sum;
          transferTarget.balance += sum;
          recordAdd(client, "TRANSFER", initialBalance, sum, client.balance);
          recordAdd(transferTarget, "TRANSFER", targetInitBalance, sum, transferTarget.balance);
          System.out.println("TRANSFER SUCCESSFUL");
          
        break;
        case "n":
          System.out.println("CANCEL TRANSFER");
        break;
        default:
          System.out.println("INVALID INPUT");
      }
    }
    
}