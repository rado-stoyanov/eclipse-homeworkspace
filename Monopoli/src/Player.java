public class Player {
	
	
	private String name;
	private int money;
	private String position;
	private boolean isOnTheMove;
	
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
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public boolean isOnTheMove() {
		return isOnTheMove;
	}
	public void setOnTheMove(boolean isOnTheMove) {
		this.isOnTheMove = isOnTheMove;
	}
	
	public Player(String name, int money, String positionIndex) {
		this.name = name;
		this.money = money;
		this.position = positionIndex;

	}
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public void renderPlayer() {
		System.out.println(this.name + ": с " + this.money + "$ " + "на позиция " + this.position);
	}
	
	



}
