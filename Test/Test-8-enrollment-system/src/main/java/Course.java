public class Course {
	String border = "*************************";
	String name;
	String instructor;
	int credit;
	
	Course(String name, String instructor, int credit) {
		this.name = name;
		this.instructor = instructor;
		this.credit = credit;
	}
	
	void courseInfo(Student... students) {
		System.out.println(border);
		System.out.println("COURSE INFO");
		System.out.println(border);
		System.out.printf("Course name: %s\n", name);
		System.out.printf("Instructor : %s\n", instructor);
		System.out.printf("Credit     : %d\n", credit);
		System.out.printf("Student    : ");
		for(Student student : students) {
			if(student.gpa >= 2) {
				System.out.print(student.name + " ");
			}
		}
		System.out.println();
		System.out.println(border);
	}
}