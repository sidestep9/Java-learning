public class Main {
	public static void main(String[] args) {
		
		//printf is a methot to use format output
		
		//%[flags][width][.precision][specifier-character]
		
		//[specifier-character]
		
		String name = "Spongebob"; //%s
		char firstLetter = 'S'; //%c
		int age = 30; //%d
		int age2 = 22;
		double height = 60.5; //%f
		boolean isEmployed = true; //%b
		
		System.out.printf("Hello %s\n", name);
		System.out.printf("Your name first letter is %c\n", firstLetter);
		System.out.printf("You are %d years old\n", age);
		System.out.printf("You are %f inches tall\n", height);
		System.out.printf("Employed: %b\n", isEmployed);
		
		System.out.printf("Hello %s, you are %d years old, %f inches tall\n", name, age, height);
		System.out.printf("%d and %d\n", age2, age);
		
		System.out.println("");
		
		//[.precision]
		
		double price = 9.99;
		double price2 = 100.5;
		double price3 = -50.15;
		
		System.out.printf("%.2f\n", price);
		System.out.printf("%.2f\n", price2);
		System.out.printf("%.2f\n", price3);
		
		System.out.println("");
		
		//[flags]
		
		//+ = output a plus
		//, = comma grouping seperator(thousands)
		//( = negative numbers are enclosed in ()
		//space = display a minus if negative, space if positive
		
		System.out.printf("%+.2f\n", price);
		System.out.printf("%+.2f\n", price2);
		System.out.printf("%+.2f\n", price3);
		
		System.out.println("");
		
		//[width]
		
		//0 = zero padding
		//number  = right justify pading
		//negative number = left justify padding
		
		int id1 = 3;
		int id2 = 29;
		int id3 = 384;
		int id4 = 2938;
		
		System.out.printf("%04d\n", id1);
		System.out.printf("%04d\n", id2);
		System.out.printf("%04d\n", id3);
		System.out.printf("%04d\n", id4);
		
		System.out.println("");
	}
}