public class Main {
	public static void main(String[] args) {
		
		Student student1 = new Student("Alice", 37, 3.8);
		Student student2 = new Student("Erica", 21, 2.5);
		Student student3 = new Student("Elaine", 14, 1.9);
		
		Course course1 = new Course("Calculus", "Ms.Martha", 2);
		Course course2 = new Course("Web Development", "Ms.Robin", 4);
		
		student1.status(course1, course2);
		student2.status(course1, course2);
		student3.status(course1, course2);
		
		System.out.println();
		
		course1.courseInfo(student1, student2, student3);
		course2.courseInfo(student1, student2, student3);
	}
}