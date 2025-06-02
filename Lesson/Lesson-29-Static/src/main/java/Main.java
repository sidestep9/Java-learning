public class Main {
	public static void main(String[] args) {
		
		// static = Modifies a method or variable belong to the class rather than any specific object. Commonly used for utility methods or shared resources.
		// it is better to access static method through the class name rather than the object
		
		Friend friend1 = new Friend("Spongebob");
		Friend friend2 = new Friend("Patrick");
		
		System.out.println(Friend.numOfFriends);
		System.out.println(Friend.numOfFriends);
	}
}