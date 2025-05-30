public class Main {
	public static void main(String[] args) {
		
		String name = "Ren Handsome";
		
		int length = name.length(); //check how many characters are in a string
		char letter = name.charAt(0); //check what character is at what length, starts from 0
		int index = name.indexOf("s"); //check the where the first occurence of a character
		int lastIndex = name.lastIndexOf("n"); //check the last occurence of a character
		
		name.toUpperCase(); //set all caps
		name.toLowerCase(); //set all lower case
		name.trim(); //remove empty spaces
		name.replace("e", "k"); //replace character
		
		if(name.isEmpty()) {
			System.out.println("Your name is empty");
		}
		else {
			System.out.println("Your name is " + name);
		} //a boolean check if string is empty
		
		if(name.contains("s")) {
			System.out.println("Your name contains the letter S");
		}
		else {
			System.out.println("Hello " + name);
		} //checks if a string contains whatever is in ()
		
		if(name.equalsIgnoreCase("password")) {
			System.out.println("Your name cannot be password");
		}
		else {
			System.out.println("Hello " + name);
		} //checks if a string has equal value to whatever is in (""). p.s add IgnoreCase to ignore uppercase chatacters
		
		
	}
}