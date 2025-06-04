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
					 	
					 	do {
					 		 	InputHandler.lineBreak();
					 		 	choice = MenuUtils.showMenu("=== BANK SIMULATOR ===",
					 		 	                            "ENTER (1-3): ",
					 		 	                            "[1] ADMIN",
					 		 	                            "[2] CLIENT",
					 		 	                            "[3] EXIT");
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