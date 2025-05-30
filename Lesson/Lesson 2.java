public class Main {
	public static void main (String[] args) {

		// Variables = a reusable container to store a value.
		//                   = It behaves as if it was the value it contains.
		
		// Primitive = simple value stored directly in memory (stack)
		// Reference = memory address (stack) that points to the (heap)
		
		// Primitive    vs    Reference
		// --------------             ---------------
		// int                        string
		// double                array
		// char                    object
		// boolean
		
		// Exercise!
		
		String name = "Sidestep";
		int level = 9;
		double health = 0;
		char grade = 'E';
		boolean isAlive = health > 0;
		
		System.out.println ("Your character's name is " + name);
		System.out.println ("You are level " + level);
		System.out.println ("Health = " + health);
		System.out.println ("Grade = " + grade);
		
		if(isAlive){
		    System.out.println ("Status = Alive");
		}
		else {
		    System.out.println ("Status = Dead");
		}
		
		if(health >= 50 && health < 75) {
		    System.out.println ("You should heal soon");
		}
		else if(health >= 75 && health <= 100) {
		    System.out.println ("You're a bit bruised");
		    }
		else if (health <= 0) {
		    System.out.print ("You're no longer breathing");
		}
		else {
		    System.out.println ("You're alive and well");
		}

	}
}