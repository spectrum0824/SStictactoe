public class Board {
    private int row;
    private int col;

    private String[][] board;

    public Board() {
        row = 9;
        col = 9;
        board = new String[row][col];
        for(int i=0; i<row; i++){
        	for(int j=0; j<col; j++){
        		board[i][j] = "_";
        	}
        }


    }
    
    public void update(int x, int y, String sym) {
        board[x-1][y-1] = sym;
        toStringer();

    }
    public String[][] getBoard(){
    	return board;
    }
    
    public void toStringer() {
        for(int i = 0 ; i <= col ; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 0 ; i < row ; i++){
            System.out.print((i+1)+" ");
            for(int j = 0 ; j < col ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}