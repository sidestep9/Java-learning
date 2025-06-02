public class Student {
	String name;
	int id;
	double gpa;
	String status;
	String border = "*************************";
	
	Student(String name, int id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
		if(gpa >= 3.5) {
			status = "Honor Student";
		}
		else if(gpa >= 2) {
			status = "Regular Student";
		}
		else {
			status = "Probation";
		}
	}
	
	void status(Course... courses) {
		System.out.println(border);
		System.out.println("STUDENT INFO");
		System.out.println(border);
		System.out.printf("Name     : %s\n", name);
		System.out.printf("ID       : %d\n", id);
		System.out.printf("GPA      : %.1f\n", gpa);
		System.out.printf("Status   : %s\n", status);
		System.out.print("Course   : ");
		if(gpa > 2) {
			for(Course course : courses) {
				System.out.print(course.name + " ");
			}
		}
		else {
			System.out.print("No course due to probation");
		}
		System.out.println();
		System.out.println(border);
	}
}