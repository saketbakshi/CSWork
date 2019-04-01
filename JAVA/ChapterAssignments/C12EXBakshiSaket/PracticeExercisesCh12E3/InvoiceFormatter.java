import java.util.ArrayList;
/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 3 of Chapter 12.
	Formats an invoice to be printed.
*/
public class InvoiceFormatter
{
	private Address billingAddress;
	private ArrayList<LineItem> items;
	private double amountDue;

	public InvoiceFormatter(Invoice anInvoice)
	{
		billingAddress = anInvoice.getAddress();
		items = anInvoice.getItems();
		amountDue = anInvoice.getAmountDue();
	}

	public String format()
	{
		String r = "                      I N V O I C E\n\n";
		r = r + billingAddress.getName() + "\n" + billingAddress.getStreet() + "\n" + billingAddress.getCity() + ", " + billingAddress.getState() + " " + billingAddress.getZip();
		r = r + String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");
		for(LineItem item : items)
		{
			Product theProduct = item.getProduct();
			r = r + String.format("%-30s%8.2f%5d%8.2f", theProduct.getDescription(), theProduct.getPrice(), item.getQuantity(), item.getTotalPrice()) + "\n";
		}

		r = r + String.format("\nAMOUNT DUE: $%8.2f", amountDue);

		return r;
	}
}