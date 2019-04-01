/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 3 of Chapter 12.
	Describes an article, that only comes as a single charge, like shipping.
*/
public class LineItemFixedCharge extends LineItem
{
	/**
		Creates a fixed charge product.
	*/
	public LineItemFixedCharge(Product aProduct)
	{
		setQuantity(1);
		setProduct(aProduct);
	}
}