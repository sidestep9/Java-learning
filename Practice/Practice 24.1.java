import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[][] classroom = new String[3][4];
		
		seat(classroom);
		
		for(String[] seats : classroom) {
			for(String seat : seats) {
				System.out.printf("[%-7s] ", seat);
			}
			System.out.println();
		}
		
		search(classroom);
		
		scanner.close();
	}
	
	static void seat(String[][] classroom) {
		String name;
		
		for(int i = 0; i < classroom.length; i++) {
			for(int j = 0; j < classroom[i].length; j++) {
				System.out.printf("Enter name for seat [%d][%d]: ", i + 1, j + 1);
				name = scanner.nextLine().trim();
				classroom[i][j ] = name;
				System.out.println();
			}
		}
	}
	
	static void search(String[][] classroom) {
		String target;
		boolean check = false;
		
		System.out.print("Enter the student's name: ");
		target = scanner.nextLine().trim();
		
		for(int i = 0; i < classroom.length; i++) {
			for(int j = 0; j < classroom[i].length; j++) {
				check = target.equals(classroom[i][j]);
				if(check) {
					System.out.printf("Student: %s [%d][%d]", classroom[i][j], i + 1, j + 1);
				}
				break;
			}
		}
		
		if(!check) {
			System.out.println("Not found");
		}
	}
}