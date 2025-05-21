public class Main {
	public static void main(String[] args) {
		
		int rows = 4;
		int columns = 4;
		int count = 1;
		char symbol = 'Y';
		
		for(int i = 0; i < rows; i++) {
			for(int  j = 0; j < columns; j++) {
				if((i == 0 || i == 3) || (j == 0 || j == 3)) {
					System.out.print(symbol + " ");	
				}
				else{
					System.out.print("X ");	
				}
			}
			System.out.println();
		}
	}
}