import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		int secretNumber = (int)(Math.random() * 10 + 1);
		int numTries = 0;

		System.out.println("Welcome to the guessing game!");

		System.out.println("Guess a number between 1 and 10"); // is a try unless 0 or 1
		System.out.println("Press 0 for a Hint");
		System.out.println("Press -1 to quit");
		int numberGuessed = input.nextInt();

		while (numberGuessed != -1) {
			while (numberGuessed == 0) {
				Thread.sleep(2000);
				System.out.println("Let me think");
				if (secretNumber % 2 == 0) {
					Thread.sleep(2000);
					System.out.println("The secret number is even.");
				} else {
					Thread.sleep(2000);
					System.out.println("The secret number is odd.");
				}
				System.out.println("Guess a number between 1 and 10");
				numberGuessed = input.nextInt();
			}

			if (secretNumber == numberGuessed) {
				Thread.sleep(2000);
				System.out.println("Congrats you guessed the right number!");
				// add code to stop app
				System.exit(0);
			}

			if (secretNumber > numberGuessed) {
				Thread.sleep(2000);
				System.out.println("Too Low");
				numTries = numTries + 1; // increment
			} else {
				Thread.sleep(2000);
				System.out.println("Too High");
				numTries++;
			}

			if (numTries == 3) {
				System.out.println("You have exceed your 3 attempts");
				System.exit(0);
			}

			Thread.sleep(2000);
			System.out.println("Guess a number between 1 and 10");
			numberGuessed = input.nextInt();
		} // end of while loop

		System.out.println("Thanks for playing");
		input.close();
	}

}
