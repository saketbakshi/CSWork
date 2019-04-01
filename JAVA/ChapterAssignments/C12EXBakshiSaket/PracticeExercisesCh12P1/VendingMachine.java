import java.util.ArrayList;
/**
	Saket Bakshi. 3/28/19. Period 6. This is used for project 1 of Chapter 12.
	Holds Products for purchase.
*/
public class VendingMachine
{
	private ArrayList<Product> items;

	/**
		Creates a vending machine.
	*/
	public VendingMachine()
	{
		items = new ArrayList<Product>();
	}
	
	/**
		Creates a vending machine with the items listed.
		@param items the items included
	*/
	public VendingMachine(ArrayList<Product> items)
	{
		this.items = items;
	}

	/**
		Adds products to the machine.
		@param aProduct the product to add
	*/
	public void add(Product aProduct)
	{
		items.add(aProduct);
	}

	/**
		Removes products from the machine.
		@param aProduct the product to remove
	*/
	public void remove(Product aProduct)
	{
		int placement = 0;
		for(int i = 0; i < items.size(); i++)
		{
			if(aProduct.getDescription().equals(items.get(i).getDescription()))
			{
				placement = i;
			}
		}
		items.remove(placement);
	}
	
	/**
		Returns all the items currently in the machine.
		@return all the items
	*/
	public ArrayList<Product> getItems()
	{
		return items;
	}
	
	/**
		Prints what is inside the machine.
	*/
	public void whatsInside()
	{
		for(Product item : items)
		{
			System.out.println(item.getDescription());
		}
	}
}