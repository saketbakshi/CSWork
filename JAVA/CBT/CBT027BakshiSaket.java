import java.util.Scanner;

public class CBT027BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int secret, guess;

		secret = 1 +(int)(Math.random()*100);

		System.out.println("I'm thinking of an number between 1-100. Try to guess it.");
		System.out.print("> ");
		guess = key.nextInt();

		while(secret!=guess)
		{
			if(guess<secret)
			{
				System.out.println("Sorry, your guess is too low. Try again.");
			}

			if(guess>secret)
			{
				System.out.println("Sorry, your guess is too high. Try again.");
			}

			System.out.print("> ");
			guess = key.nextInt();
		}

		System.out.println("You guessed it! What are the odds?!?");
	}
}