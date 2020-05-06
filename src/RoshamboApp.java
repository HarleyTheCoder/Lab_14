import java.util.Scanner;

public class RoshamboApp {
	
	// FOR THE EXTENDED CHALLENGES, I would have done the last one 
	// (doesBeat and doesTie), except that I figured out a simpler
	// way. You can see the method right after "main".
	// 
	// I still added something extra to the enum to make it work.
	// 
	// I hope this still counts for points. :)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Welcome message
		System.out.println("Welcome to Rock Paper Scissors!\n");
		
		//Let user pick name and create a player
		Player player1 = createHumanPlayer(scan);
		System.out.println();
		//Select your opponent
		Player player2 = selectOpponent(scan);
		
		//loop to play multiple rounds
		while (true) {
			Roshambo hand1 = player1.generateRoshambo();
			Roshambo hand2 = player2.generateRoshambo();
			
			//show results
			RoshamboApp.showResults(player1, player2, hand1, hand2);
			
			//find and show winner
			RoshamboApp.getWinner(player1, player2,
					hand1.getValue() - hand2.getValue());
			
			//Show each player's wins
			RoshamboApp.showWins(player1, player2);
			
			//Ask to play again
			System.out.print("\nPlay again? (y/n): ");
			if (!Validator.isYesNo(scan)) {
				System.out.print("\nGoodbye!");
				break;
			}
		}
		scan.close();

	} //Yeah I edited Kyle's just for kicks
	
	
	//Calculate winner based on a trick I figured out. *feels clever*
	public static void getWinner(Player player1, Player player2, double var) {
		Player winner;
		if (var == 0) {
			System.out.println("It's a draw!");
			return;
		} else if (var == -0.5 || var == -0.4 ||
				var == 0.9) {
			winner = player1;
		} else {
			winner = player2;
		}
		winner.setWins(1);
		System.out.println("The winner is " + winner.getName() + "!");
	}
	
	
	//Select opponent
	private static Player selectOpponent(Scanner scan) {
		System.out.print("Would you like to face Balla or Winslow?: ");
		while (true) {
			//Add validation
			String input = Validator.getStringMatchingRegex(scan,
							"[a-zA-Z]*").toUpperCase();
			if (input.startsWith("B")) {
				return new RockPlayer("Balla");
			} else if (input.startsWith("W")) {
				return new RandomPlayer("Winslow");
			} else {
				System.out.print("Invalid answer. Please enter an opponent: ");
			}
		}
	}
	
	//Create human player
	private static HumanPlayer createHumanPlayer(Scanner scan) {
		//Pick name
		System.out.print("What's your name?: ");
		String name = Validator.getStringMatchingRegex(scan, "[a-zA-Z\\s]*");
		//Create player
		return new HumanPlayer(name, scan);
	}
	
	//Show each player's number of wins
	public static void showResults(Player player1, Player player2,
								Roshambo hand1, Roshambo hand2) {
		//getting fancy with formatting - get length of longest name
		String format;
		int longer = player1.getName().length();
		if (longer < player2.getName().length()) {
			longer = player2.getName().length();
		}
		//add 9 to the length for formatting, adjust format
		//9 is the length of characters that come after name
		longer += 2;
		format = "%-" + longer + "s";
		
		//print formatted score
		System.out.println();
		System.out.printf(String.format(format, player1.getName() + ": ") + 
										hand1);
		System.out.println();
		System.out.printf(String.format(format, player2.getName() + ": ") + 
										hand2);
		System.out.println();
	}
	
	//Show each player's number of wins
	public static void showWins(Player player1, Player player2) {
		//getting fancy with formatting - get length of longest name
		String format;
		int longer = player1.getName().length();
		if (longer < player2.getName().length()) {
			longer = player2.getName().length();
		}
		//add 9 to the length for formatting, adjust format
		//9 is the length of characters that come after name
		longer += 9;
		format = "%-" + longer + "s";
		
		//print formatted score
		System.out.println();
		System.out.printf(String.format(format, player1.getName() + "'s wins:") + 
						player1.getWins());
		System.out.println();
		System.out.printf(String.format(format, player2.getName() + "'s wins:") + 
				player2.getWins());
		System.out.println();
	}
}
