import java.util.Scanner;

public class Validator {
	
	//Check if they answered yes or no, ask again if not
	public static boolean isYesNo(Scanner scan) {
		String input = scan.nextLine().toLowerCase();
		while (true) {
			if (input.startsWith("y")) {
				return true;
			} else if (input.startsWith("n")) {
				return false;
			} else {
				System.out.print("Invalid input. Please try again. (y/n): ");
				input = scan.nextLine().toLowerCase();
			}
		}
	}
	
	//Get any string
	//From GC but edited
	public static String getString(Scanner scnr) {
		//This approach uses exception handling.
		//while (true) {
		//	if (scnr.hasNext()) {
				
		//	}
		//}
		while (true) {
			try {
				String string = scnr.nextLine();
				return string;
			} catch (Exception e) {
				System.out.print("Invalid string. Please try again: ");
				scnr.nextLine();
			}
		}
		
	}

	//Get a string of input from the user that must match the given regex.
	//From GC but edited
	public static String getStringMatchingRegex(Scanner scnr, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = Validator.getString(scnr);
			
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.print("Input must be in a letters. Please try again: ");
				isValid = false;
			}
			
		} while (!isValid);
		return input;
	}
	
}
