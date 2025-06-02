import java.util.Scanner;

public class Main {
				
				public static void main(String[] args) {
					 	
					 	int choice;
					 	boolean isExit = false;
					 	Bank bank = new Bank();
								
					 	//		test
					 	bank.addAdminTemporary();
					 	AdminHandler.adminMenu();
					 	
			/*		 	do {
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
					 		 		 	   AdminHandler.adminCredential();
					 		 		 	break;
					 		 		 	case 3:
					 		 		 	   isExit = true;
					   		 	break;
		  			 		 	default:
    					 		 			System.out.println("INVALID CHOICE");
    					 	}
					 	}while(!isExit); */
				}
}