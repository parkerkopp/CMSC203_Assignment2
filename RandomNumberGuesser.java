//Remember that we aren't supposed to import things
//Remember
//Remember
//Remember
import java.util.*;

public class RandomNumberGuesser {
	
	public static void main(String[] args) {
		
		String playAgain;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			
			int randNumber = 37; //RNG.rand();
			int highGuess = 100;
			int lowGuess = 1;
			boolean correctGuess = false;
			
			System.out.println("Enter your first guess: ");
			int guess = keyboard.nextInt();
			RNG.inputValidation(guess, lowGuess, highGuess);
			
			int count= 0;
			
			while(count <= 7 && correctGuess != true) {
				
				if(RNG.inputValidation(guess, lowGuess, highGuess) == false) {
					
					guess = keyboard.nextInt();
					continue;
					
				}
				
				
				if(guess > randNumber) {
					
					System.out.println("Your guess is too high");
					highGuess = guess;
					count++;
					System.out.println("Number of guesses is: " + count);
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					guess = keyboard.nextInt();
					
				}
				
				else if(guess < randNumber) {
					
					System.out.println("Your guess is too low");
					lowGuess = guess;
					count++;
					System.out.println("Number of guesses is: " + count);
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					guess = keyboard.nextInt();
					
				}
				
				else
					
					correctGuess = true;
							
			}
			
			if(correctGuess == true)
				
				System.out.println("Congratulations, you guessed correctly");
			
			else
				
				System.out.println("You exceded the maximum number of guesses, 7. Try again.");
			
			
			System.out.println("Try again? (yes or no)");
			keyboard.nextLine();
			playAgain = keyboard.nextLine();
			
		} while(playAgain.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for playing...");
		
		keyboard.close();
		
	}

}
