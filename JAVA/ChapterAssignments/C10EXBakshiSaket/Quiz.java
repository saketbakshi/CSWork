/** Saket Bakshi. 3/4/19. Period 6. This is used for question 2 of Chapter 10.
	Creates a Quiz class that implements the interface Measurable so we can test interfaces.
*/
public class Quiz implements Measurable
{
	private int score;
	private String letterGrade;

	/**
		Constructs an object with a score and letter grade.
	*/
	public Quiz()
	{
		score = 0;
		letterGrade = "";
	}

	/**
		Constructs an object with a score and letter grade.
		@param scored the score
		@param grade the letter grade
	*/
	public Quiz(int scored, String grade)
	{
		score = scored;
		letterGrade = grade;
	}

	/**
		Returns the score.
		@return the score
	*/
	public double getMeasure()
	{
		return score;
	}

	/**
		Returns the grade
		@return the letter grade
	*/
	public String getGrade()
	{
		return letterGrade;
	}
}