public class Main {
	public static void main(String[] args) {
		
		Student student1 = new Student("Alice", 12, "6th");
		Student student2 = new Student("Martha", 16, "11th");
		Student student3 = new Student("Madison", 18, "12th");
		
		Course course1 = new Course("Mathematic", "Ms.Elizabeth", 3);
		Course course2 = new Course("Science", "Ms.Griffin", 4);
		Course course3 = new Course("P.E", "Ms.Hana", 1);
		
		student1.introduction();
		student1.enrollInCourse(course1);
		
		student2.introduction();
		student2.enrollInCourse(course2);
		
		student3.introduction();
		student3.enrollInCourse(course3);
		
		course1.printDetails();
		course2.printDetails();
		course3.printDetails();
	}
}