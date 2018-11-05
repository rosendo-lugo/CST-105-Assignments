import javax.swing.JOptionPane;
import java.util.Random;

public class GuessingGame {
	
	public static final Random RANDOM = new Random();
	public static final int MAX_NUMBER = 10000;
	public static final int MIN_NUMBER = 1;
	public static void main(String[] args) {

		Random random = new Random();
		int randomNumber = random.nextInt(MAX_NUMBER) + 1;
		boolean userCorrect = false;
		String userInputString;
		int userGuessedNumber = 0;
		int guessCount = 0;
		

		userInputString = JOptionPane.showInputDialog("Enter a guess between " + MIN_NUMBER + " and " + MAX_NUMBER + " : ");
		while (!userCorrect) {
			userGuessedNumber = Integer.parseInt(userInputString);
			guessCount++;
			
			if(userGuessedNumber > randomNumber ) {
				JOptionPane.showMessageDialog(null, "( "+ userGuessedNumber  + ")  is too high, lower");
				userInputString = JOptionPane.showInputDialog("Enter a guess between " + MIN_NUMBER + " and " + MAX_NUMBER + " : ");
			} else if(userGuessedNumber < randomNumber) {
				JOptionPane.showMessageDialog(null, "( "+ userGuessedNumber  + ") is too low, higher");
				userInputString = JOptionPane.showInputDialog("Enter a guess between " + MIN_NUMBER + " and " + MAX_NUMBER + " : ");
			} else {
				JOptionPane.showMessageDialog(null, "( "+ userGuessedNumber  + ") Yes, you guessed the number. It took you " + guessCount + " guesses");
				userCorrect = true;{

				}
			}
		}
		System.exit(0);
	}
		
	}

