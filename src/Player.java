
public abstract class Player {
	
	private String name;
	private int wins = 0;

	public Player(String name) {
		this.name = name;
	}
	
	public abstract Roshambo generateRoshambo();
	
	public String getName() {
		return name;
	}
	
	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins += wins;
	}
}
