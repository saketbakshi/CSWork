/** Saket Bakshi. 2/10/19. Period 6. This is used for question 2 of Chapter 9.
	A fill-in-the-blank question with a text and an answer.
*/
public class FillInQuestion extends Question
{
	/**
		Constructs a question with empty question and answer.
	*/
	public FillInQuestion()
	{
		super();
	}

	/**
		Constructs a question with empty question and answer.
		@param questionAndAnswer the fill-in-the-blank with the answer filled out
	*/
	public FillInQuestion(String questionAndAnswer)
	{
		int beginningOfAnswer = questionAndAnswer.indexOf("_");
		super.setText(questionAndAnswer.substring(0, beginningOfAnswer) + "____");

		int endOfAnswer = questionAndAnswer.indexOf("_", beginningOfAnswer + 1);
		super.setAnswer(questionAndAnswer.substring(beginningOfAnswer + 1, endOfAnswer)); 
	}
}