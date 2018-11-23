/* Saket Bakshi, Period 6
Question 2.2 of Ch 3 project. This program declares a class with the methods 
and instance variables stated in exercise 2.1. Has all comments necessary for javadoc documentation.
*/

public class VendingMachine
{

	//instance variables
	private int tokens;
	private int cans;

	/** This creates an object of the vending machine class that
	has a certain amount of cans that cost 1 token and the number of tokens. It can be used by methods that
	find the number of cans or tokens in the machine. It also has methods to
	add more cans, buy cans, and remove the coins.
	@param cans the number of initial cans
	@param tokens the number of initial tokens
	*/
	public VendingMachine(int cans)
	{
		this.cans = cans;
		this.tokens = 0;
	}

	public VendingMachine()
	{
		this.cans = 0;
		this.tokens = 0;
	}

	/** This returns the amount of cans in the machine
	@return the number of cans in the machine
	*/
	public int getCans()
	{
		return this.cans;
	}

	/** this adds cans to the machine
	@param cansAdded the number of cans added
	*/
	public void addCans(int cansAdded)
	{
		this.cans = this.cans + cansAdded;
	}

	/**this removes soda for the price of one token added to the machine
	*/
	public void buySoda()
	{
		this.cans = this.cans - 1;
		this.tokens = this.tokens + 1;
	}

	/**this returns the number of tokens in the machine
	@return the number of tokens in the machine
	*/
	public int getTokens()
	{
		return this.tokens;
	}

	/**this removes all tokens from the machine
	*/
	public void removeTokens()
	{
		this.tokens = 0;
	}
}