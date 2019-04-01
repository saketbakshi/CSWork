/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 3 of Chapter 12.
	Describes a quantity of an article to purchase.
*/
public class LineItem
{
	private int quantity;
	private Product theProduct;

	/**
		Constructs a blank LineItem
	*/
	public LineItem()
	{
		theProduct = new Product("", 0);
		quantity = 0;
	}

	/**
		Constructs an item from the product and the quantity.
		@param aProduct the product
		@param aQuantity the item quantity
	*/
	public LineItem(Product aProduct, int aQuantity)
	{
		theProduct = aProduct;
		quantity = aQuantity;
	}

	/**
		Sets the quantity of the product
	*/
	public void setQuantity(int aQuantity)
	{
		quantity = aQuantity;
	}

	/**
		Sets the product name
	*/
	public void setProduct(Product aProduct)
	{
		theProduct = aProduct;
	}

	/**
		Computes the total cost of this line item.
		@return the total price
	*/
	public double getTotalPrice()
	{
		return theProduct.getPrice() * quantity;
	}
	
	/**
		Returns the product.
		@return the product
	*/
	public Product getProduct()
	{
		return theProduct;
	}
	
	/**
		Returns the product.
		@return the product
	 */
	public int getQuantity()
	{
		return quantity;
	}
}