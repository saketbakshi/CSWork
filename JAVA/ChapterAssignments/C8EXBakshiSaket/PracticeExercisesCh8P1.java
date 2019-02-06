/* Saket Bakshi 2/3/19. Period 6
This program, for Project 1 of Ch 8, creates a class to open a three digit lock.
*/
public class PracticeExercisesCh8P1
{

	private boolean open;
	private int number1, number2, number3;
	private int currentPlace;
	private int[] attempt;
	private int order;

	/** Creates a lock object
	@param secret1 the first lock digit
	@param secret2 the second lock digit
	@param secret3 the third lock digit
	*/
	public PracticeExercisesCh8P1(int secret1, int secret2, int secret3)
	{
		this.open = false;
		
		this.number1 = secret1;
		this.number2 = secret2;
		this.number3 = secret3;

		this.currentPlace = 0;
		this.attempt = new int[3];
		this.attempt[0] = 0;
		this.attempt[1] = 0;
		this.attempt[2] = 0;
		
		this.order = 0;

	}

	/** Resets the lock.
	*/
	public void reset()
	{
		this.attempt[0] = 0;
		this.attempt[1] = 0;
		this.attempt[2] = 0;
		this.currentPlace = 0;
		this.order = 0;
	}

	/** Turns the lock to the right.
	*/
	public void turnRight(int ticks)
	{
		this.currentPlace = this.currentPlace - ticks;
		while(this.currentPlace < 0)
		{
			this.currentPlace = this.currentPlace + 40;
		}
		this.attempt[this.order] = this.currentPlace;		
		this.order++;
	}

	/** Turns the lock to the right.
	*/
	public void turnLeft(int ticks)
	{
		this.currentPlace = this.currentPlace + ticks;
		while(this.currentPlace > 39)
		{
			this.currentPlace = this.currentPlace - 40;
		}
		this.attempt[this.order] = this.currentPlace;
		this.order++;
	}

	/** Tries to open the lock.
	*/
	public void open()
	{
		if(this.attempt[0] == this.number1 && this.attempt[1] == this.number2 && this.attempt[2] == this.number3)
		{
			this.open = true;
			System.out.println("The lock is open!");
		}
		else
		{
			this.open = false;
			System.out.println("The lock was not opened. You inputted \"" + this.attempt[0] + ", " + this.attempt[1] + ", " + this.attempt[2] + ".\" \nTry again.\n");
		}
	}
}