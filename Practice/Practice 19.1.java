import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String message = "";
		String level = "";
		int code = 0;
		
		System.out.print("Enter the message: ");
		message = scanner.nextLine();
		System.out.print("Enter the level: ");
		level = scanner.nextLine();
		System.out.print("Enrer the code: ");
		code = scanner.nextInt();// This still forces me to input number.
		
		message = message.trim();
		level = level.trim();
		
		if(level.equals("")) {
			logs(message, code);	
		}
		else if(code == 0) {
			logs(message, level);
		} // I don't like code == 0 because 0 is still a number. is there away to just empty int like string does?'
		else if(level.equals("") && code == 0) {
			logs(message);
		}
		else {
			logs(message, level);
			logs(message, code);
		}
		
		scanner.close();
	}
	static void logs(String message) {
		System.out.println(message);
	}
	static void logs(String message, String level) {
		System.out.println(message + " " + level);
	}
	static void logs(String message, int code) {
		System.out.println(message + " " + code);
	}
}