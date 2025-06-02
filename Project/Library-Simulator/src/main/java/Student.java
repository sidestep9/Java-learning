public class Student extends User{
	
	String gradeLevel;
	
	Student(String name, String gradeLevel) {
		super(name);
		this.gradeLevel = gradeLevel;
		status = "Student";
	}
	
	@Override
	protected void customDetails() {
		System.out.println("Grade: " + gradeLevel);
	}
}