import java.util.Scanner;
public class Game {
	
	static Board board = new Board();
	static String symbol = "";
	static String [][] temp;
	static int x,y,round = 1;
    static Scanner sc = new Scanner(System.in);
    static Player player1 , player2;
	
	public static void main(String[] args){
		player1 = new Player("player1",1);
		player2 = new Player("player2",2);

        System.out.println("==============================");
        System.out.println("=========Tic tac toe==========");
        System.out.println("==============================");
        System.out.println();
		System.out.println("XXXX      XXXX  OOOOOOOOOOOOOO");
        System.out.println(" XXXX    XXXX   OOOOOOOOOOOOOO");
        System.out.println("  XXXX  XXXX    OOOO      OOOO");
        System.out.println("   XXXXXXXX     OOOO      OOOO");
        System.out.println("   XXXXXXXX     OOOO      OOOO");
        System.out.println("  XXXX  XXXX    OOOO      OOOO");
        System.out.println(" XXXX    XXXX   OOOOOOOOOOOOOO");
        System.out.println("XXXX      XXXX  OOOOOOOOOOOOOO");
        System.out.println();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");

        System.out.println();
        board.toStringer();

		while(!isOver()){
			playerTurn();
		}
	}
	public static void playerTurn(){
        System.out.println();
        if(round%2 != 0){
            System.out.println(player1.getName() + "'s turn");
            symbol = player1.getSym();
        }else{
            System.out.println(player2.getName() + "'s turn");
            symbol = player2.getSym();
        }
        System.out.print("Please select row : ");
        x = sc.nextInt();
        System.out.print("Please select col: ");
        y = sc.nextInt();
        if(isEmpty(x,y)) {
            System.out.println();
            System.out.println("You placed " + symbol + " on (" + x + "," + y + ")");
            board.update(x, y, symbol);
            round++;
        }

    }
	public static boolean isEmpty(int x , int y ){
        temp = board.getBoard();
	    if(!temp[x-1][y-1].equals(symbol)&&!temp[x-1][y-1].equals("_")){
	        System.out.println("\nPlease Input again!");
	        playerTurn();
	        round--;
	        return false;
        }
        return true;
    }

	public static boolean isOver(){
		temp = board.getBoard();
		String hor = "";
		boolean over = false;
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> 78cbe3092aae1bb03bb48452ce410ae181a6002e

		for(int a = 0 ; a < 2 ; a++){
			for(int j=0; j<9; j++){
				for(int i=0; i<9; i++){
					if(a==0){
						hor = hor.concat(temp[j][i]);
					} else {
						hor = hor.concat(temp[i][j]);
<<<<<<< HEAD
>>>>>>> 78cbe3092aae1bb03bb48452ce410ae181a6002e
=======
>>>>>>> 78cbe3092aae1bb03bb48452ce410ae181a6002e
					}
				}
				if(hor.contains("XXXXX") || hor.contains("OOOOO")) over = true;
			}
		}
		int label = 1;
        for(int a = 0 ; a < 2 ; a++) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if(a==1){
                        label = -1;
                    }
                    if (temp[i][j].equals(symbol) && i < 5 && (j < 5 && label == 1 || j>4 && label == -1)) {
                        if (temp[i + 1][j + (1*label)].equals(symbol)) {
                            if (temp[i + 2][j + (2*label)].equals(symbol)) {
                                if (temp[i + 3][j + (3*label)].equals(symbol)) {
                                    if (temp[i + 4][j + (4*label)].equals(symbol)) {
                                        over = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(over) gameOver();
		return over;
	}
	public static void gameOver(){
        if(round%2 == 0){
            System.out.println(player1.getName() + " Win!!");
        }else{
            System.out.println(player2.getName() + " Win!!");
        }
	    System.out.println("Game Over");
    }
}
