public enum Roshambo {
	PAPER(0), ROCK(.4), SCISSORS(.9);
	
	private double value;

	Roshambo(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	// Convert string to first letter upper and rest lower
	public String toString() {
		String s = "";
		switch(this) {
		case ROCK: s = "Rock";
		break;
		case PAPER: s = "Paper";
		break;
		case SCISSORS: s = "Scissors";
		break;
		}
		return s;
	}
}
