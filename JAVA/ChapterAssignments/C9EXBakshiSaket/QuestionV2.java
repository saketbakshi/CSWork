/** Saket Bakshi. 2/10/19. Period 6. This is used for question 3 of Chapter 9.
	A question with a text and an answer. Answer is lenient with lower and upper case.
*/
public class QuestionV2
{
	private String text;
	private String answer;

	/**
		Constructs a question with empty question and answer.
	*/
	public QuestionV2()
	{
		text = "";
		answer = "";
	}

	/**
		Sets the question text
		@param questionText the text of this question
	*/
	public void setText(String questionText)
	{
		text = questionText;
	}

	/**
		Sets the answer for this question. Is lenient with upper and lowercase.
		@param correctResponse the answer
	*/
	public void setAnswer(String correctResponse)
	{
		answer = correctResponse.toLowerCase();
	}

	/**
		Checks a given response for correctness.  Is lenient with upper and lowercase.
		@param response the response to check
		@return true if the response was correct, false otherwise
	*/
	public boolean checkAnswer(String response)
	{
		String reply = response.toLowerCase();
		return reply.equals(answer.toLowerCase());
	}

	/**
		Displays this question
	*/
	public void display()
	{
		System.out.println(text);
	}

	public String getAnswer() {return answer;}
}