public class Person {
	String first;
	String last;
	
	Person(String first, String last) {
	  this.first = first;
	  this.last = last;
	}
	
	void showInfo() {
	  System.out.println(first + " " + last);
	}
}