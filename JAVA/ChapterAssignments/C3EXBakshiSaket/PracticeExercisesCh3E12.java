/*
Saket Bakshi
Period 6
10/4/18
This program creates a class, normally named "Bug", that moves along a horizontal line.
*/
public class PracticeExercisesCh3E12
{

	private int position;
	private int direction;

	public PracticeExercisesCh3E12()
	{
		position = 0;
		direction = 1;
	}

	/** Defines a Bug class variable with a position.
	Has methods for moving, turning, and getting the position.
		@param p initial position
	*/
	public PracticeExercisesCh3E12(int p)
	{
		position = p;
		direction = 1;
	}

	/** Moves bug in one space in its direction.
	*/
	public void move()
	{
		this.position = position + direction;
	}

	/** Turns bug to opposite direction.
	*/
	public void turn()
	{
		this.direction = direction * -1;
	}

	/** Returns bug's position
		@return the position of the bug
	*/
	public int getPosition()
	{
		return position;
	}
}