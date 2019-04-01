import java.util.Random;
/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 4 of Chapter 12.
	Creates questions for kids to solve.
*/
public class QuestionGenerator
{
	private int firstNumber;
	private int secondNumber;
	private int answer;
	private String question;

	/**
		Creates a question for teaching kids. Creates different questions depending on the level of question required.
		@param lvl the level of question required
	*/
	public QuestionGenerator(int lvl)
	{
		Random rand = new Random();
		switch(lvl)
		{
			case 1: //level 1 question
				answer = rand.nextInt(11);
				firstNumber = rand.nextInt(answer);
				secondNumber = answer - firstNumber;
				question = "What is " + firstNumber + " plus " + secondNumber + "?";
				break;
			case 2: //level 2 question
				firstNumber = rand.nextInt(10);
				secondNumber = rand.nextInt(10);
				answer = firstNumber + secondNumber;
				question = "What is " + firstNumber + " plus " + secondNumber + "?";
				break;
			case 3: //level 3 question
				firstNumber = rand.nextInt(10);
				secondNumber = rand.nextInt(firstNumber); 
				answer = firstNumber - secondNumber;
				question = "What is " + firstNumber + " minus " + secondNumber + "?";
				break;
			default:
				// System.out.println("There is currently no level this high");
				break;
		}
	}

	/**
		Returns the number for part 1.
		@return the first number
	*/
	public int getFirstNumber()
	{
		return firstNumber;
	}

	/**
		Returns the number for part 2.
		@return the second number
	*/
	public int getSecondNumber()
	{
		return secondNumber;
	}

	/**
		Returns the answer.
		@return the answer
	*/
	public int getAnswer()
	{
		return answer;
	}

	/**
		Returns the question.
		@return the question
	*/
	public String getQuestion()
	{
		return question;
	}
}