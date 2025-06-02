import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		String name;
		String firstName;
		String lastName;
		double english;
		String englishGrade;
		double math;
		String mathGrade;
		double science;
		String scienceGrade;
		double totalScore;
		String totalGrade;
		double averageScore;
		String averageGrade;
		
		System.out.print("Enter name: ");
		name = scanner.nextLine().trim();
		if(!name.contains(" ")) {
			firstName = capitalize(name);
			lastName = "";
		}
		else {
			firstName = name.substring(0, name.lastIndexOf(" "));
			lastName = name.substring(name.lastIndexOf(" ") + 1);
			firstName = capitalize(firstName);
			lastName = capitalize(lastName);
			name = firstName + " " + lastName;
			}
		
		do {
			System.out.print("Enter your english score: ");
			english = scanner.nextDouble();
			englishGrade = gradeAssign(english);
			if(english < 0 || english > 100) {
				System.out.println("INVALID NUMBER");
			}
		}while(english < 0 || english > 100);
		do {
			System.out.print("Enter your math score: ");
			math = scanner.nextDouble();
			mathGrade = gradeAssign(math);
			if(math < 0 || math > 100) {
				System.out.println("INVALID NUMBER");
			}
		}while(math < 0 || math > 100);
		do {
			System.out.print("Enter you science score: ");
			science = scanner.nextDouble();
			scienceGrade = gradeAssign(science);
			if(science < 0 || science > 100) {
				System.out.println("INVALID NUMBER");
			}
		}while(science < 0 || science > 100);
		
		totalScore = totalScore(english, math, science);
		averageScore = averageScore(english, math, science);
		averageGrade = gradeAssign(averageScore);
			
		showSummary(name, english, englishGrade, math, mathGrade, science, scienceGrade, averageScore, averageGrade, totalScore);
		
		scanner.close();
		
		// BUGS/IMPROVEMENTS
		// found bug, error when name doesn't have last name -> fixed ✓
		// verbose and capitalize doesn't work for middle name'
		// minus grade check -> fixed ✓
		// showSummary method is verbose
	}
	
	static String capitalize(String cap) {
		return cap.substring(0,1).toUpperCase() + cap.substring(1).toLowerCase();
	}
	static double totalScore(double english, double math, double science) {
		return english + math + science;
	}
	static double averageScore(double english, double math, double science) {
		return (english + math + science) / 3;
	}
	static String gradeAssign(double score) {
		if(score < 60) {
			return "F";
		}
		else if(score < 70) {
			return "D";
		}
		else if(score < 80) {
			return "C";
		}
		else if(score < 90) {
			return "B";
		}
		else {
			return "A";
		}
	}
	static void showSummary(String name, double english, String eGrade, double math, String mGrade, double science, String sGrade, double averageScore, String averageGrade, double totalScore) {
		System.out.println("\n*************");
		System.out.printf("Name         : %s\n", name);
		System.out.printf("English score: %.2f\n", english);
		System.out.printf("        grade: %s\n", eGrade);
		System.out.printf("Math    score: %.2f\n", math);
		System.out.printf("        grade: %s\n", mGrade);
		System.out.printf("Science score: %.2f\n", science);
		System.out.printf("        grade: %s\n", sGrade);
		System.out.printf("Average score: %.2f\n", averageScore);
		System.out.printf("        grade: %s\n", averageGrade);
		System.out.printf("Total   score: %.2f\n", totalScore);
		System.out.println("*************");
	}
}