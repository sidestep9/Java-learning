import java.util.ArrayList;

public class Main {
	
	static String border = "********************";
	public static void main(String[] args) {
		ArrayList<Tiger> tigers = new ArrayList<Tiger>();
		ArrayList<Panda> pandas = new ArrayList<Panda>();
		
		tigers.add(new Tiger("Felinae", "Mimi", 5));
		tigers.add(new Tiger("Felinae", "Momo", 3));
		tigers.add(new Tiger("Felinae", "Mami", 7));
		
		pandas.add(new Panda("Ursidae", "Er", 4));
		pandas.add(new Panda("Ursidae", "Ur", 6));
		
		for(Tiger tiger : tigers) {
			System.out.println(border);
			tiger.displayInfo();
			System.out.println();
			tiger.sound();
			System.out.println(border + "\n");
		}
		
		for(Panda panda : pandas) {
			System.out.println(border);
			panda.displayInfo();
			System.out.println();
			panda.sound();
			System.out.println(border + "\n");
		}
	}
}