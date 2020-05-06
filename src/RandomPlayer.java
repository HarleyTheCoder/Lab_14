
public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		//generate random integer between 1 and 3
		int num = (int)(Math.random() * 3) + 1;
		//select corresponding option
		switch (num) {
		case 1: return Roshambo.ROCK;
		case 2: return Roshambo.PAPER;
		case 3: return Roshambo.SCISSORS;
		default: return null;
		}
		
	}
	
	
	
}
