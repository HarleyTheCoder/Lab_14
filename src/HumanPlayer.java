import java.util.Scanner;

public class HumanPlayer extends Player {
	
	private Scanner scan;
	//add scanner to constructor
	//it's ok to change the constructor this way
	public HumanPlayer(String name, Scanner scan) {
		super(name);
		this.scan = scan;
	}

	@Override
	public Roshambo generateRoshambo() {
		//ask for choice
		System.out.print("\nRock, paper, or scissors? (R/P/S): ");
		//get choice
		while (true) {
			String input = Validator.getStringMatchingRegex(scan,
					"[a-zA-Z]*").toUpperCase();
			//validate choice
			if (input.startsWith("R")) {
				return Roshambo.ROCK;
			} else if (input.startsWith("P")) {
				return Roshambo.PAPER;
			} else if (input.startsWith("S")) {
				return Roshambo.SCISSORS;
			} else {
				System.out.print("Invalid answer. Please try again. (R/P/S): ");
			}
			System.out.println();
		}
		
	}

}
