package ControlFlow;

import java.util.Scanner;

public class ControlFlowHW {

	final static int MAGIC_BALL_MAX = 75;
	final static int RANDOM_BALL_MAX = 65;

	public static void main(String[] args) {

		System.out.println("Hello World");
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();

		// Asking for user input
		System.out.println("Please enter your name" + ".");
		Scanner userInput = new Scanner(System.in);

		String name = userInput.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Do you wish to continue " + "to the interactive portion?");
		String userContinue = userInput.nextLine();
		if (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")) {

			System.out.println("Let's continue the game" + ".");

			// all variables for loops
			boolean keepGoing = true;
			while (keepGoing) {
				String favoritePet = "";
				int agePet = 0;
				int luckyNumber = 0;
				String favQuarterBack = "";
				int jerseyNumber = 0;
				int modelYear = 0;
				String actorActress = "";
				int randomNumber = 0;

				// while loops with if/else
				boolean waitingForPetResponse = true;
				while (waitingForPetResponse) {
					System.out.println("Enter the name of your favorite pet:");
					String petName = userInput.nextLine();
					if (petName.length() > 2) {
						favoritePet = petName;
						waitingForPetResponse = false;
					} else {
						System.out.println("Please enter a response that is three letters or longer.");
					}
				}

				boolean waitingForAgeResponse = true;
				while (waitingForAgeResponse) {
					System.out.println("Enter the age of your favorite pet?");
					// TODO add error handling for userInput

					waitingForAgeResponse = false;
					try {
						agePet = Integer.parseInt(userInput.nextLine()); // put this on all integers
					} catch (NumberFormatException e) {
						System.out.println("Error: " + e.getMessage());
						System.out.println("You didn't put in a number! Try again.");
						waitingForAgeResponse = true;

					}

				}
				boolean waitingForNumberResponse = true;
				while (waitingForNumberResponse) {
					System.out.println("Enter your lucky number:");
					// TODO add error handling for userInput

					waitingForNumberResponse = false;
					try {
						luckyNumber = Integer.parseInt(userInput.nextLine());

					} catch (NumberFormatException e) {
						System.out.println("Error: " + e.getMessage());
						System.out.println("You didn't put in a number! Try again.");
						waitingForNumberResponse = true;
					}

				}
				boolean waitingForQuarterback = true;
				while (waitingForQuarterback) {
					System.out.println("Please enter the name of your favorite quarterback:");
					String quarterBackResponse = userInput.nextLine();
					if (quarterBackResponse.length() > 0) {
						favQuarterBack = quarterBackResponse;
						waitingForQuarterback = false;
					} else {
						System.out.println("There was an error with your entry." + "Please try again.");
					}
				}
				boolean waitingForJerseyNo = true;
				while (waitingForJerseyNo) {
					System.out.println("Enter your favorite quaterback's jersey number:");
					// TODO Add error handling for userInput

					waitingForJerseyNo = false;
					try {
						jerseyNumber = Integer.parseInt(userInput.nextLine());

					} catch (NumberFormatException e) {
						System.out.println("Error: " + e.getMessage());
						System.out.println("You didn't put in a number! Try again.");
						waitingForJerseyNo = true;
					}

				}
				boolean waitingForModelCarYear = true;
				while (waitingForModelCarYear) {
					System.out.println("What is the two digit model year of your car?");
					// TODO add error handling for userInput

					waitingForModelCarYear = false;

					try {
						modelYear = Integer.parseInt(userInput.nextLine());

					} catch (NumberFormatException e) {
						System.out.println("Error: " + e.getMessage());
						System.out.println("You didn't put in a number! Using 0.");
						waitingForModelCarYear = true;
					}

				}
				boolean waitingForActorName = true;
				while (waitingForActorName) {
					System.out.println("What is the first name of your favorite actor or actress?");
					String actorNameResponse = userInput.nextLine();
					if (actorNameResponse.length() > 0) {
						actorActress = actorNameResponse;
						waitingForActorName = false;
					} else {
						System.out.println("Please enter a response.");
					}

				}
				boolean waitingForRandomNumber = true;
				while (waitingForRandomNumber) {
					System.out.println("Enter a random number between 1 and 50:");
					// TODO add error handling for userInput

					waitingForRandomNumber = false;
					try {
						randomNumber = Integer.parseInt(userInput.nextLine());
					} catch (NumberFormatException e) {

						System.out.println("Error: " + e.getMessage());
						System.out.println("You didn't put in a number! Try again.");
						waitingForRandomNumber = true;
					}

				}
				// All questions asked of user
				// Generating output of 5 random numbers b/t 1-65 and
				// "magic ball" between 1-75.

				int[] randNums = new int[3];
				for (int i = 0; i < randNums.length; i++) {
					randNums[i] = (int) Math.random() * 65 + 1;

				}
				int magicBall = jerseyNumber * randNums[0];
				// making sure number doesn't go below 0
				if (magicBall < 0) {
					magicBall *= -1;

				}
				// making sure number doesn't go above 75
				magicBall = magicBall % MAGIC_BALL_MAX;

				// Find the 3rd letter of their favorite pet. Convert that character
				// value to an integer value.
				int randomBallOne = favoritePet.charAt(2);
				randomBallOne = randomBallOne % RANDOM_BALL_MAX;

				while (randomBallOne < 1) {
					randomBallOne += RANDOM_BALL_MAX;
				}

				// Use two digit model year of their car and add their lucky number to it.
				int randomBallTwo = modelYear + luckyNumber;
				randomBallTwo = randomBallTwo % RANDOM_BALL_MAX;

				while (randomBallTwo < 1) {
					randomBallTwo += RANDOM_BALL_MAX;
				}
				// Use the value 42.
				int randomBallThree = 42;

				// Convert the last letter of their favorite actor/actress to an integer.
				int randomBallFour = actorActress.charAt(actorActress.length() - 1);
				randomBallFour = randomBallFour % RANDOM_BALL_MAX;

				// Age of their favorite pet + their car model year.
				int randomBallFive = agePet + modelYear;
				randomBallFive = randomBallFive % RANDOM_BALL_MAX;
				while (randomBallFive < 1) {
					randomBallFive += RANDOM_BALL_MAX;
				}
				// All numbers calculated and spit out at "Lottery Numbers:"

				System.out.println("Lottery numbers:" + randomBallOne + "," + randomBallTwo + "," + randomBallThree
						+ "," + randomBallFour + "," + randomBallFive + ", and your Magic Ball: " + magicBall);
				System.out.println("Would you like to play again? (y/n)");
				String playAgainResponse = userInput.nextLine();
				if (playAgainResponse.equalsIgnoreCase("Yes") || playAgainResponse.equalsIgnoreCase("Y")) {
					keepGoing = true;

				} else {
					keepGoing = false;
				}

				// TODO: ask user if they want to play again
			}
			System.out.println("The game has ended.");
		} else {
			System.out.println("Please return later to complete" + ".");
		}

	}

}
