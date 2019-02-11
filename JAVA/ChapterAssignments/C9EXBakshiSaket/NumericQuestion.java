/** Saket Bakshi. 2/10/19. Period 6. This is used for question 1 of Chapter 9.
	A numeric question with a text and an answer where approximations are ok.
*/
public class NumericQuestion extends Question
{
	private double answer;

	/**
		Constructs a question with empty question and answer.
	*/
	public NumericQuestion()
	{
		super();
	}

	/**
		Sets the answer for this question.
		@param correctResponse the answer
	*/
	public void setAnswer(double correctResponse)
	{
		answer = correctResponse;
	}

	/**
	Checks a given response for correctness.
	@param response the response to check
	@return true if the response was correct, false otherwise
	*/
	public boolean checkAnswer(double response)
	{
		if(Math.abs(response - answer) <= 0.01)
			return true;
		else
			return false;
	}
}