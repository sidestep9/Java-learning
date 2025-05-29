public class User {
	String name;
	String email;
	int age;
	
	User() {
		this.name = "Guest";
		this.email = "Not provided";
		this.age = 0;
	}
	
	User(String name) {
		this.name = name;
		this.email = "Not provided";
		this.age = 0;
	}
	
	User(String name, String email) {
		this.name = name;
		this.email = email;
		this.age = 0;
	}
	
	User(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}
}