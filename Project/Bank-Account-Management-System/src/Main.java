import java.util.Scanner;

public class Main {
				
				public static void main(String[] args) {
					 	
					 	int choice;
					 	boolean isExit = false;
					 	AccountHandler accountHandler = new AccountHandler();
					 	AdminHandler adminHandler = new AdminHandler(accountHandler);
					 	ClientHandler clientHandler = new ClientHandler(accountHandler);
								
					 	//		test
					 	accountHandler.addAdminTemporary();
					 	accountHandler.addClientTemporary();
					 	InputHandler.lineBreak();
					 	
					 	do {
					 		 	InputHandler.lineBreak();
					 		 	System.out.println("BANK SIMULATOR");
					 		 	InputHandler.lineBreak();
					 		 	System.out.println("[1] ADMIN");
					 		 	System.out.println("[2] CLIENT");
					 		 	System.out.println("[3] EXIT");
					 		 	InputHandler.lineBreak();
					 		 	choice = InputHandler.inputInt("ENTER (1-3): ");
					 		 	InputHandler.lineBreak();
					 		 	switch(choice) {
					 		 		 	case 1:
					 		 		 	   adminHandler.adminCredential();
					 		 		 	break;
					 		 		 	case 2:
					 		 		 	    clientHandler.clientCredential();
					 		 		 	break;
					 		 		 	case 3:
					 		 		 	   isExit = true;
					   		 	break;
		  			 		 	default:
    					 		 			System.out.println("INVALID CHOICE");
    					 	}
					 	}while(!isExit); 
				}
}