/* Saket Bakshi 2/3/19. Period 6
This program, for #3 of Ch 8, completes a coin value class.
*/
public class PracticeExercisesCh8E3Coin
{
	private double value;
	private String name;

	/**	Constructs a coin.
	@param value the monetary value of the coin.
	@param name the name of the coin
	*/
	public PracticeExercisesCh8E3Coin(double value, String name)
	{
		this.value = value;
		this.name = name;
	}

	/**	Gets the coin value.
	@return the value of the coin
	*/
	public double getValue()
	{
		return value;
	}
	
	/**	Gets the coin name.
	@return the name of the coin
	*/
	public String getName()
	{
		return name;
	}
}