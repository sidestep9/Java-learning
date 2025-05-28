public class Student {
	String name;
	int age;
	String gradeLevel;
	boolean isEnrolled = false;	
	
	Student(String name, int age, String gradeLevel) {
		this.name = name;
		this.age = age;
		this.gradeLevel = gradeLevel;
		this.isEnrolled = true;
	}
	
	void introduction() {
		System.out.printf("Hello, my name is %s. I'm %d years old, and I'm in the %s grade.\n", name, age, gradeLevel);
		System.out.println();
	}
	
	void enrollInCourse(Course course) {
		System.out.println(name + " has enrolled in " + course.name + " with " + course.instructor);
		System.out.println();
	}
}