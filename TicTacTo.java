import java.util.Scanner;

public class TicTacTo {
	
	//Creating the 3 by 3 array		
		//Initializing the board
	public static String [][] initializeBoard(String[][] arr) {
		String ast = "*";
		char val = 'a';
		for(int i = 0; i <arr.length; i++) {
			arr[i][0]= String.valueOf(i);
			for (int j = 1; j < arr[i].length; j++) {
				arr[0][j] = String.valueOf(val);
				val++;		
				}
			for(int j = 1; j< arr[i].length; j++) {
				arr[i][j]= ast;
			}
			}
		return arr;
		}
	
		//Printing the board
	public static String[][] printSeatDisplay(String [][] arr) {
		for(int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2s", arr[i][j]);	
				}
			System.out.println();
				}
		return arr;
	}
	
	
	

	//Method for selecting space within array to be X or O	
		//Selecting space	
		public void letterSelector(String [][] arr) {
			
			Scanner scan = new Scanner(System.in);
			
			String Coordinate; 
			char firstSymbol;
			char secondSymbol;
			Coordinate = scan.nextLine();
			firstSymbol = Coordinate.charAt(0);
			secondSymbol = Coordinate.charAt(1);
			
			
			
			while(gameWin() != true || gameDraw() != true) {
			for(int i = 0; i <arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if(arr[i][0].equals(String.valueOf(firstSymbol))) {
							if (arr[i][j].equals(String.valueOf(secondSymbol))) {
							arr[i][j] = String.valueOf(scan.nextLine());
							}	
					}	
						System.out.printf("%2s", arr[i][j]);
				}
				System.out.println();
		
			}
			}
		}
	
	
	

	//Method to detect 3 in  a row
		
			public static boolean gameWin(String [][] arr) {
		
		for(int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j].equals(arr[i][j+1]))  {
					arr[i][j] = String.valueOf(scan.nextLine());
					}
				}
			}
		}
	
	
	
	//Method to detect full board
	public static boolean gameDraw() {
		return "!";
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [][] board = new String [4][4];
		
		TicTacTo ttt = new TicTacTo();
		
		board = ttt.initializeBoard(board);
		
		ttt.printSeatDisplay(board);
		
		System.out.println("The rules of the game are: Enter the coordinate to fill a space (e.g: 2");
		
		
		

	}

}
