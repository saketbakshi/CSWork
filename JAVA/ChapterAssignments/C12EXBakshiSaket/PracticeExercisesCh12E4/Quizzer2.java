import java.util.Scanner;
/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 4 of Chapter 12.
	Quizzes children to teach arithmetic.
*/
public class Quizzer2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Are you ready for a quiz?? (Answer with \"-1\" at any question to stop)");

		Game game = new Game();

		boolean gameOver = false;
		int answer = 0;
		boolean wantsToPlay = true;
		while((game.getScore() != 5 || answer == -1) && wantsToPlay)
		{
			QuestionGenerator question = new QuestionGenerator(game.getLvl());
			System.out.println(question.getQuestion());
			boolean correct = false;
			while(game.getTries() > 0 && !correct && wantsToPlay)
			{	
				answer = in.nextInt();
				if(answer == question.getAnswer())
				{
					game.increaseScore();
					correct = true;
					System.out.println("Correct! Your Score is " + game.getScore());
				}
				else if(answer == -1)
				{
					System.out.println("Thanks for trying!");
					wantsToPlay = false;
				}
				else
				{
					game.decreaseTries();
					System.out.println("False! You have " + game.getTries() + " try left.");
				}
			}
			game.resetTries();
		}
		game.increaseLevel();

		if(wantsToPlay)
			System.out.println("\nYou've moved to the next level!\n");
		
		while((game.getScore() != 10 || answer == -1) && wantsToPlay)
		{
			QuestionGenerator question = new QuestionGenerator(game.getLvl());
			System.out.println(question.getQuestion());
			boolean correct = false;
			while(game.getTries() > 0 && !correct && wantsToPlay)
			{	
				answer = in.nextInt();
				if(answer == question.getAnswer())
				{
					game.increaseScore();
					correct = true;
					System.out.println("Correct! Your Score is " + game.getScore());
				}
				else if(answer == -1)
				{
					System.out.println("Thanks for trying!");
					wantsToPlay = false;
				}
				else
				{
					game.decreaseTries();
					System.out.println("False! You have " + game.getTries() + " try left.");
				}
			}
			game.resetTries();
		}
		game.increaseLevel();

		if(wantsToPlay)
			System.out.println("\nYou've moved to the next level!\n");
	
		while((game.getScore() != 15 || answer == -1) && wantsToPlay)
		{
			QuestionGenerator question = new QuestionGenerator(game.getLvl());
			System.out.println(question.getQuestion());
			boolean correct = false;
			while(game.getTries() > 0 && !correct && wantsToPlay)
			{	
				answer = in.nextInt();
				if(answer == question.getAnswer())
				{
					game.increaseScore();
					correct = true;
					System.out.println("Correct! Your Score is " + game.getScore());
				}
				else if(answer == -1)
				{
					System.out.println("Thanks for trying!");
					wantsToPlay = false;
				}
				else
				{
					game.decreaseTries();
					System.out.println("False! You have " + game.getTries() + " try left.");
				}
			}
			game.resetTries();
		}
		System.out.println("Thanks for playing!");

	}
}