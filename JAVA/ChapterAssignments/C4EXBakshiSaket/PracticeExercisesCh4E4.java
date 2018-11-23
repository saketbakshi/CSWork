/* Saket Bakshi. 10/15/18. Period 6
This program, for #4 of Ch 4, takes two user inputted integers and 
calculates various parameters about them.
*/
public class PracticeExercisesCh4E4
{
	private int firstNumber;
	private int secondNumber;
	private int sum;
	private int difference;
	private int product;
	private double average;
	private int distance;
	private int maximum;
	private int minimum;

	/** This class takes two integers and calculates their sum, difference, product, average, distance, maximum, and minimum.
	@param first the first integer
	@param second the second integer
	*/
	public PracticeExercisesCh4E4(int first, int second)
	{
		this.firstNumber = first;
		this.secondNumber = second;
		this.sum = first + second;
		this.difference = first - second;
		this.product = first * second;
		this.average = this.product / 2;
		this.distance = Math.abs(this.difference);
		this.maximum = Math.max(this.firstNumber, this.secondNumber);
		this.minimum = Math.min(this.firstNumber, this.secondNumber);
	}

	/** Returns the sum
	@return the sum of the integers
	*/
	public int getSum()
	{
		return this.sum;
	}

	/** Returns the difference
	@return the difference of the integers
	*/
	public int getDifference()
	{
		return this.difference;
	}

	/** Returns the product
	@return the product of the integers
	*/
	public int getProduct()
	{
		return this.product;
	}

	/** Returns the average
	@return the average of the integers
	*/
	public double getAverage()
	{
		return this.average;
	}

	/** Returns the distance
	@return the distance of the integers
	*/
	public int getDistance()
	{
		return this.distance;
	}

	/** Returns the maximum
	@return the maximum of the integers
	*/
	public int getMax()
	{
		return this.maximum;
	}

	/** Returns the minimum
	@return the minimum of the integers
	*/
	public int getMin()
	{
		return this.minimum;
	}
}