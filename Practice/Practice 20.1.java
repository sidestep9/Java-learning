import java.util.Scanner;

public class Main {
	
	static double MI_TO_KM = 1.609344;
	static double KM_TO_MI = 0.62137119;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double distance;
		int unit;
		int convert;
		double result;
		boolean isRunning = true;
		
		System.out.println("**************");
		System.out.println("UNIT CONVERTER");
		System.out.println("**************");
		System.out.print("Enter the distance: ");
		distance = scanner.nextDouble();
		do {
			System.out.println("Enter the unit:\n[1. KM] [2. M] [3.MI]");
			unit = scanner.nextInt();
			if(unit > 3 || unit < 1) {
				System.out.println("INVALID UNIT");
			}		
		}while(unit < 1 || unit > 3);
		
		do {
			System.out.println("To which unit to convert:\n[1.KM] [2.M] [3.MI]");
			convert = scanner.nextInt();
			if(convert < 1 || convert > 3){
				System.out.println("INVALID UNIT");
			}
		}while(convert < 1 || convert > 3);
		
		result = convertLogic(distance, unit, convert);
		
		showResult(distance, unit, result, convert);
		
		scanner.close();
	}
	
	static double convertLogic(double distance, int unit, int convert) {
		
		if(unit == 1) {
			switch(convert) {
				case 1:
					distance = distance * 1;
					return distance;
				case 2:
					distance = distance * 1000;
					return distance;
				case 3:
					distance = distance * KM_TO_MI;
					return distance;
				default:
					return 0;
			}
		}
		else if(unit == 2) {
			switch(convert) {
				case 1:
					distance = distance / 1000;
					return distance;
				case 2:
					distance = distance * 1;
					return distance;
				case 3:
					distance = (distance / 1000) * KM_TO_MI;
					return distance;
				default:
					return 0;
			}
		}
		else {
			switch(convert) {
				case 1:
					distance = distance * MI_TO_KM;
					return distance;
				case 2:
					distance = distance * MI_TO_KM * 1000;
					return distance;
				case 3:
					distance = distance * 1;
					return distance;
				default:
					return 0;
			}
		}
	}
	
	static void showResult(double distance, int unit, double result, int convert) {
		if(unit == 1) {
			switch(convert) {
				case 1:
					System.out.printf("Original: %.2fKM\nConverted: %.2fKM", distance, result);
				break;
				case 2:
					System.out.printf("Original: %.2fKM\nConverted: %.2fM", distance, result);
				break;
				case 3:
					System.out.printf("Original: %.2fKM\nConverted: %.2fMI", distance, result);
				break;
				default:
					System.out.println();
			}
		}
		else if(unit == 2) {
			switch(convert) {
				case 1:
					System.out.printf("Original: %.2fM\nConverted: %.2fKM", distance, result);
				break;
				case 2:
					System.out.printf("Original: %.2fM\nConverted: %.2fM", distance, result);
				break;
				case 3:
					System.out.printf("Original: %.2fM\nConverted: %.2fMI", distance, result);
				break;
				default:
					System.out.println();
			}
		}
		else {
			switch(convert) {
				case 1:
					System.out.printf("Original: %.2fMI\nConverted: %.2fKM", distance, result);
				break;
				case 2:
					System.out.printf("Original: %.2fMI\nConverted: %.2fM", distance, result);
				break;
				case 3:
					System.out.printf("Original: %.2fMI\nConverted: %.2fMI", distance, result);
				break;
				default:
					System.out.println();
			}
		}
	}
}