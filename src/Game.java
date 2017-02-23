import java.util.Scanner;
public class Game {
	
	static Board board = new Board();

	public static void main(String[] args){
		int x,y,round = 1;
		Scanner sc = new Scanner(System.in);
		Player player1 = new Player("player1",1);
		Player player2 = new Player("player2",2);
		board.toStringer();
		
		while(!isOver()){
			String symbol = "";
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
	
	
		

		return over;
	}
	
}
