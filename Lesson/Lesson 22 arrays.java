import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// arrays = a collection of value of the same data type.
		
		Scanner scanner = new Scanner(System.in);
		
		String[] fruits = {"apple", "orange", "banana", "mango"};
		String[] foods;
		int size;
		int [] numbers = {1, 9, 93, 2 , 3 ,7};
		int target;
		boolean isFound = false;
		
		//fruits[0] = "strawberry"; //change arrays value at any given index
		//int numOfFruits = fruits.length; //count the number of elements in an array
		//Arrays.sort(fruits); //sort arrays alphabetically
		//Arrays.fill(fruits, "chicken");  //fill an array with the given value (the whole elements?)
		
		
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}//enhanced for loop (only for arrays?)
		System.out.println();
		
		
		target = 3;
		for(int j = 0; j < numbers.length; j++) {
			if(target == numbers[j]) {
				System.out.println("Target found at index: " + j);
				isFound = true;
				break;
			}
		}
		if(!isFound) {
			System.out.println("Index not found");
		}
		
	
			
		System.out.print("\nEnter how many foods do you want: ");
		size = scanner.nextInt();
		scanner.nextLine();
		foods = new String[size];
				
		for(int i = 0; i < foods.length; i++) {
			System.out.print("Enter the food: ");
			foods[i] = scanner.nextLine();
		}
		
		for(String food : foods) {
			System.out.print(food + " ");
		}
		
		scanner.close();
	}
}