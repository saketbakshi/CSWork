/**
	Saket Bakshi. 3/28/19. Period 6. This is used for project 1 of Chapter 12.
	Makes a product with a simple description and cost.
*/
public class Product
{
	private String description;
	private double cost;
	
	/**
		Creates a product with a description and price.
	*/
	public Product()
	{
		description = "";
		cost = 0;
	}
	
	/**
		Creates a product with a description and price.
		@param aDescription the description
		@param cost the price
	*/
	public Product(String aDescription, double cost)
	{
		description = aDescription;
		this.cost = cost;
	}
	
	/**
		Returns the description of the product.
		@return the description
	*/
	public String getDescription()
	{
		return description;
	}
	
	/**
		Returns the cost of the product.
		@return the cost
	*/
	public double getCost()
	{
		return this.cost;
	}
}