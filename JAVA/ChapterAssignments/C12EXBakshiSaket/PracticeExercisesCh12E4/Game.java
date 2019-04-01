/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 4 of Chapter 12.
	Describes the level of question needed and the amount of tries taken to answer a question. Also counts a score of correctly answered questions.
*/
public class Game
{
	private int lvl; 
	private int tries;
	private int score;

	/**
		Creates an Arthimatic Game object to track and score kids as they practice math.
	*/
	public Game()
	{
		lvl = 1;
		tries = 2;
		score = 0;
	}

	/**
		Returns the current level of question.
		@return the level
	*/
	public int getLvl()
	{
		return lvl;
	}

	/**
		Returns the amount of tries that are left.
		@return the current tries left
	*/
	public int getTries()
	{
		return tries;
	}

	/**
		Returns the current score
		@return the score
	*/
	public int getScore()
	{
		return score;
	}

	/**
		Resets the amount of tries left.
	*/
	public void resetTries()
	{
		tries = 2;
	}

	/**
		Increases the score by 1.
	*/
	public void increaseScore()
	{
		score++;
	}

	/**
		Increases the level of question difficulty by 1.
	*/
	public void increaseLevel()
	{
		lvl++;
	}
}