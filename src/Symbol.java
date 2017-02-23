
public class Symbol {
	String symbol;
	public Symbol(int player){
		if(player == 1){
			symbol = "X";
		}else{
			symbol = "O";
		}
	}
	
	public String toString(){
		return symbol;
	}

}
