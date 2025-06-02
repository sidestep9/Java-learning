public class Employee extends Person{
	
	int salary;
	
	Employee(String first, String last, int salary) {
	  super(first, last);
	  this.salary = salary;
	}
	
	void showSalary() {
	  System.out.println(first + "'s salary is: " + salary);
	}
}