import java.util.ArrayList;
/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 3 of Chapter 12.
	Describes an invoice for a set of purchased products.
*/
public class Invoice
{
	private Address billingAddress;
	private ArrayList<LineItem> items;

	/**
		Constructs an invoice
		@param anAddress the billing address
	*/
	public Invoice(Address anAddress)
	{
		items = new ArrayList<LineItem>();
		billingAddress = anAddress;
	}

	/**
		Adds a charge for a product to this invoice.
		@param aProduct the product that the customer ordered
		@param quantity the quantity of the product
	*/
	public void add(Product aProduct, int quantity)
	{
		LineItem anItem = new LineItem(aProduct, quantity);
		items.add(anItem);
	}

	/**
		Adds a charge for a fixed price product to this invoice.
		@param aProduct the fixed charge of the customer's order
	*/
	public void add(Product aProduct)
	{
		LineItemFixedCharge anItem = new LineItemFixedCharge(aProduct);
		items.add(anItem);
	}

	/**
		Computes the total amount due.
		@return the amount due
	*/
	public double getAmountDue()
	{
		double amountDue = 0;
		for(LineItem item : items)
		{
			amountDue = amountDue + item.getTotalPrice();
		}
		return amountDue;
	}

	/**
		Returns the mailing address.
		@return the address
	*/
	public Address getAddress()
	{
		return billingAddress;
	}

	/**
		Returns the list of items.
		@return the address
	*/
	public ArrayList<LineItem> getItems()
	{
		return items;
	}
}