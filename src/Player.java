
public class Player{
	private String name;
	Symbol sym;
	public Player(String name, int playerNum){
		sym = new Symbol(playerNum);
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public String getSym(){
		return sym.toString();
	}
}
