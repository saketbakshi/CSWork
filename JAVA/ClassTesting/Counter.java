//september 24 2018
public class Counter
{
	//instance variables
	private int cValue;

	//Constructors

	//Default Constructor... empty set
	public Counter()
	{
		cValue = 0;
	}

	//one integer argument constructor
	public Counter(int initialValue)
	{
		cValue = initialValue;
	}

	public int getValue() //accessor method that returns the value
	{
		return cValue;
	}

	//mutator methods
	public void click()
	{	
		cValue = cValue + 1;
	}

	public void unclick()
	{
		cValue = cValue -1;
	}

	//reset method
	public void reset()
	{
		cValue = 0;
	}
}