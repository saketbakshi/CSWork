/*
Saket Bakshi
Period 6
10/11/18
This program creates a class, normally named "student", for a student with a name their quizzes.
*/
public class PracticeExercisesCh3E4
{

	//instance variables
	private String name;
	private double score, averageScore;
	private int quizNumber;
	/** Creates a student class variable with a name and an initial quiz score. Has
	methods to get the name, add another quiz, get the total points, and get the average
	score.
	@param name the student's name
	@param score the student's first quiz score
	*/
	public PracticeExercisesCh3E4(String name, double score)
	{
		this.name = name;
		this.score = score;
		this.quizNumber = 1;
		this.averageScore = score;
	}

	/** Returns the student's name
	@return the student's name
	*/
	public String getName()
	{
		return name;
	}

	/** Adds another quiz
	@param score the new quiz score
	*/
	public void addQuiz(int score)
	{
		this.score = this.score + score;
		this.quizNumber = this.quizNumber + 1;
	}

	/** returns the total score
	@return the total score
	*/
	public double getTotalScore()
	{
		return this.score;
	}

	/** returns the average score
	@return the average score
	*/
	public double getAverageScore()
	{
		this.averageScore = this.score/this.quizNumber;
		return this.averageScore;
	}
}