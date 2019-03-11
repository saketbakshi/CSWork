/** Saket Bakshi. 3/4/19. Period 6. This is used for question 3 of Chapter 10.
	Creates a Person class that implements the interface Measurable so we can test interfaces.
*/
public class Person implements Measurable
{
	private int height;
	private String name;

	/**
		Constructs an object with a name and height.
	*/
	public Person()
	{
		height = 0;
		name = "";
	}

	/**
		Constructs an object with a name and height.
		@param centimeters the height of the person
		@param nombre the name of the person
	*/
	public Person(int centimeters, String nombre)
	{
		height = centimeters;
		name = nombre;
	}

	/**
		Returns the height.
		@return the height
	*/
	public double getMeasure()
	{
		return height;
	}

	/**
		Returns the name
		@return the name
	*/
	public String getName()
	{
		return name;
	}
}