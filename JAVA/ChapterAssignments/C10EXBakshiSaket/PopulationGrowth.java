/** Saket Bakshi. 3/4/19. Period 6. This is used for question 1 of Chapter 10.
	Creates a PopulationGrowth class that uses a button to simulate the growth of a cockroach population.
*/
public class PopulationGrowth
{
	private int population;

	/**
		Constructs an empty population.
	*/
	public PopulationGrowth()
	{
		population = 0;
	}

	/**
		Constructs a population with a given size.
		@param size the initial size of the population.
	*/
	public PopulationGrowth(int size)
	{
		population = size;
	}

	/**
		Doubles the population.
	*/
	public void doubler()
	{
		population = population + population;
	}

	/**
		Returns the population.
		@return the population
	*/
	public int getPop()
	{
		return population;
	}
}