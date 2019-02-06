/* Saket Bakshi 2/3/19. Period 6
This program, for #3 of Ch 8, completes a cash register class.
*/
public class PracticeExercisesCh8E3
{
	private double purchase;
	private double payment;
	
	/** Constructs a cash register with no money.
	*/
	public PracticeExercisesCh8E3()
	{
		this.purchase = 0;
		this.payment = 0;
	}
	
	/** Records an item purchase.
	@param amount the price of the item
	*/
	public void recordPurchase(double amount)
	{
		this.purchase = this.purchase + amount;
	}

	/** Enters the payment received from the customer; should be called once
	for each monetary unit type
	@param count the number of monetary units
	@param coinType the type of the monetary units in the payment
	*/
	public void enterPayment(int count, PracticeExercisesCh8E3Coin coinType)
	{
		this.payment = this.payment + count * coinType.getValue();
	}
	
	/**	Computes the change due and resets the machine for the next customer.
	@return the change due to the customer
	*/
	public double giveChange()
	{
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		change = Math.round(change * 100);
		change = change / 100;
		return change;
	}
}