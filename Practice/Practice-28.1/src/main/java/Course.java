public class Course {
	String name;
	String instructor;
	int credit;
	
	Course(String name, String instructor, int credit) {
		this.name = name;
		this.instructor = instructor;
		this.credit = credit;
	}
	
	void printDetails() {
		System.out.println("***********");
		System.out.println("Course " + name);
		System.out.println("Instructor: " + instructor);
		System.out.println("Credit: " + credit);
		System.out.println("***********");
		System.out.println();
	}
}