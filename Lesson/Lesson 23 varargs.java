public class Main {
	public static void main(String[] args) {
		 // varargs = allow a method to accept a varrying number of arguments. Make methods more flexible. Java will pack the argument into an array.
		 // ... (ellipsis)
		 // can only used for one data type
		 
		 System.out.println(average(1, 4, 3, 9, 2));
	}
	
	static double average(double... numbers) {
		double sum = 0;
		
		for(double number : numbers) {
			sum += number;
		}
		
		return sum / numbers.length;
	}
}