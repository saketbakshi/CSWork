import java.util.ArrayList;
/**
	Saket Bakshi. 3/28/19. Period 6. This is used for project 1 of Chapter 12.
	Handles transactions with a vending machine.
*/
public class Cashier
{
	private double valueInserted;
	private VendingMachine aMachine;
	
	/**
		Creates a cashier to handle transactions between a buyer and a vending machine.
	*/
	public Cashier()
	{
		valueInserted = 0;
		aMachine = null;
	}
	
	/**
		Creates a cashier to handle transactions between a buyer and a vending machine.
		@param aMachine the machine being handled
	*/
	public Cashier(VendingMachine aMachine)
	{
		this.aMachine = aMachine;
		valueInserted = 0;
	}
	
	/**
		Adds a coin to the cashier for purchasing.
		@param value the value of currency added
	*/
	public void addCoin(double value)
	{
		valueInserted += value;
	}
	
	/**
		Attempts to make a transaction with a specified product.
		@param productDescription the product wanted
		@return the message about the transaction
	*/
	public String attemptTransaction(String productDescription)
	{
		boolean hasProduct = false;
		
		ArrayList<Product> items = aMachine.getItems();
		int placement = 0;
		Product wantedProduct = null;
		for(int a = 0; a < items.size(); a++)
		{
			if(items.get(a).getDescription().toLowerCase().equals(productDescription.toLowerCase()))
			{
				hasProduct = true;
				placement = a;
				wantedProduct = items.get(a);
				a = items.size();
			}
		}
		
		if(hasProduct)
		{
			if(wantedProduct.getCost() <= valueInserted)
			{
				valueInserted = 0;
				items.remove(placement);
				aMachine = new VendingMachine(items);
				return "Product purchased.";
			}
			else
				return "Not enough money inserted.";
		}
		else
			return "Product not available";
	}
}