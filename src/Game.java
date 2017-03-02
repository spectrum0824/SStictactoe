import java.util.Scanner;
public class Game {
	
	static Board board = new Board();
	static String symbol = "";
	
	public static void main(String[] args){
		int x,y,round = 1;
		Scanner sc = new Scanner(System.in);
		Player player1 = new Player("player1",1);
		Player player2 = new Player("player2",2);
		board.toStringer();
		
		while(!isOver()){
			
			System.out.println();
			if(round%2 != 0){
				System.out.println(player1.getName() + "'s turn");
				symbol = player1.getSym();
			}else{
				System.out.println(player2.getName() + "'s turn");
				symbol = player2.getSym();
			}
			System.out.print("Please select row : ");
			y = sc.nextInt();
			System.out.print("Please select col: ");
			x = sc.nextInt();
			System.out.println();
			System.out.println("You placed " + symbol + " on (" + y + "," + x + ")");
			board.update(x, y, symbol);
			round++;
			
			

			
		}
	
	}

	public static boolean isOver(){
		String[][] temp = board.getBoard();
		String hor = "";
		boolean over = false;
		for(int j=0; j<9; j++){
			for(int i=0; i<9; i++){
				hor = hor.concat(temp[j][i]);
			}
			if(hor.contains("XXXXX") || hor.contains("OOOOO")) over = true;
		}
		
		for(int j=0; j<9; j++){
			for(int i=0; i<9; i++){
				hor = hor.concat(temp[i][j]);
			}
			if(hor.contains("XXXXX") || hor.contains("OOOOO")) over = true;
		}
		for(int i = 0 ; i < 9 ; i++){
			for(int j = 0 ; j < 9 ; j++){
				if(temp[i][j].equals(symbol) && i < 5 && j < 5) {
					if(temp[i+1][j+1].equals(symbol)){
						if(temp[i+2][j+2].equals(symbol)){
							if(temp[i+3][j+3].equals(symbol)){
								if(temp[i+4][j+4].equals(symbol)){
									
									over = true;
								}
							}
						}
					}
				}
				if(temp[i][j].equals(symbol) && i < 5 && j > 5) {
					if(temp[i+1][j-1].equals(symbol)){
						if(temp[i+2][j-2].equals(symbol)){
							if(temp[i+3][j-3].equals(symbol)){
								if(temp[i+4][j-4].equals(symbol)){
							
									over = true;
								}
							}
						}
					}
				}
			}
		}
		return over;
	}
	
}
