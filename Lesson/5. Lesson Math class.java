//Math class lesson

public class Main {
	public static void main (String[] args) {
		
		System.out.println(Math.PI); //built-in PI
		System.out.println(Math.E); //Euler's number (idk what that is)
		
		double result;
		
		result = Math.pow (3, 2); //to the power
		result = Math.abs (-8); //returns the absolute(positive) of a number
		result = Math.sqrt (25);  //square root
		result = Math.round (5.71); //Round to closest int
		result = Math.ceil(5.17); //Round up
		result = Math.floor(5.71);//round down
		result = Math.max(5, 9);//returns the higher number between two values
		result = Math.min(5, 9);//same like Math.max but smaller number.
		
		System.out.println(result);
		
		/*P.S
		Always start Math.class with capital M
		System.out.printf > to limit the the digit in decimal (at least that's what this what used for from what I see) example;
		System.out.printf ("chicken %.2f", result);
		*change 2 to whatever number of digits you want to show
		*use comma (,) to add variables instead of plus (+)
		*can add a unit of measurement (cm/km/m/whatever) after %.2 (example: %.2fcm)
		*/
	}
}