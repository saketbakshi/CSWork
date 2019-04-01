import java.util.ArrayList;
/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 1 of Chapter 12.
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
		Formats the invoice
		@return the formatted invoice
	*/
	public String format()
	{
		String r = "                      I N V O I C E\n\n" + billingAddress.format() + String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");
		for(LineItem item : items)
		{
			r = r + item.format() + "\n";
		}

		r = r + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());

		return r;
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
}