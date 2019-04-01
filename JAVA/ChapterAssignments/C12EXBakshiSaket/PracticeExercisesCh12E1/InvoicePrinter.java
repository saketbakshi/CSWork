/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 1 of Chapter 12.
	This program demonstrates the invoice classes by printing a simple invoice.
*/

public class InvoicePrinter
{
	public static void main(String[] args)
	{
		Address samsAddress = new Address("Sam's Small Appliances", "100 Main Street", "Anytown", "CA", "98765");

		Invoice samsInvoice = new Invoice(samsAddress);
		samsInvoice.add(new Product("Toaster", 29.95), 50000);
		samsInvoice.add(new Product("Hair dryer", 24.95), 1);
		samsInvoice.add(new Product("Car vacuum", 19.99), 2);
		samsInvoice.add(new Product("Shipping", 5.99));

		System.out.println(samsInvoice.format());
	}
}