//import java.util.ArrayList;

public class Player {
		
	public Object PlayerSymbol = "|@|";
	private String name;
	private int money;
	private Object position;
	private int indexPosition;
	//public static ArrayList<Player> allPlayers 		= new ArrayList<Player>();
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Object getPosition() {
		return position;
	}
	public void setPosition(Object gamePlot) {
		this.position = gamePlot;
	}
	
	public int getIndexPosition() {
		return indexPosition;
	}
	public void setIndexPosition(int indexPosition) {
		this.indexPosition = indexPosition;
	}
		
	public Player(String name, int money, Object gamePlot, int indexPosition) {
		this.name = name;
		this.money = money;
		this.position = gamePlot;
		this.indexPosition = indexPosition;
	}
	
	public void renderPlayer() {
		System.out.println(this.name + ": с " + this.money + "$ " + "на позиция " + this.position + this.indexPosition);
	}


}
