public class Main {
	public static void main(String[] args) {
		
		int rows = 6;
		int columns = 9;
		char symbol = 'Y';
		boolean isBorder;
		
		for(int i = 0; i < rows; i++) {
			for(int  j = 0; j < columns; j++) {
				isBorder = (i == 0 || i == rows - 1) || (j == 0 || j == columns - 1);
				if(isBorder) {
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