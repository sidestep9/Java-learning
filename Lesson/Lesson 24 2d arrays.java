public class Main {
	public static void main(String[] args) {
		
		// 2D array = an array where each element is an array
		// useful for storing a matrix of data
		
		// EXAMPLE 1
		
		String[] fruits = {"apple", "banana", "orange"};
		String[] vegetables = {"potato", "spinach", "celery"};
		String[] meats = {"chicken", "fish", "camel", "beef"};
		
		String[][] groceries = {fruits, vegetables, meats};
		
		for(String[] foods : groceries) {
			for(String food : foods) {
				System.out.print(food + " ");
			}
			System.out.println();
		}
		
		// EXAMPLE 2
		
		char[][] telephone = {{'1', '2', '3'},
											{'4', '5', '6'},
											{'7', '8', '9'}, 	
											{'*', '0', '#'}};
											 
		for(char[] rows : telephone) {
			for(char number : rows) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}
}