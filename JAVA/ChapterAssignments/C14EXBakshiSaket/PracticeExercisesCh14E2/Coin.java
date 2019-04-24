/**
	Saket Bakshi. 4/23/19. Period 6. This is used for problem 2 of Chapter 14.
	Creates coin objects.
*/
public class Coin
{
	private double value;
	private String name;

	/**
		Creates a coin object.
	*/
	public Coin()
	{
		value = 0;
		name = "";
	}

	/**
		Creates a coin object.
		@param a the value
		@param b the name
	*/
	public Coin(double a, String b)
	{
		value = a;
		name = b;
	}

	/**
		Gets the value of the coin.
		@return the value
	*/
	public double getValue()
	{
		return value;
	}

	/**
		Gets the name of the coin.
		@return the name
	*/
	public String getName()
	{
		return name;
	}
}