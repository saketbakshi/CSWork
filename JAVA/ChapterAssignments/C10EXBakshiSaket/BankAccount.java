/** Saket Bakshi. 3/4/19. Period 6. This is used for question 1 of Chapter 10.
	Creates a BankAccount class that implements the interface Measurable so we can test interfaces.
*/
public class BankAccount implements Measurable
{
	private int balance;

	/**
		Constructs an object with a balance.
	*/
	public BankAccount()
	{
		balance = 0;
	}

	/**
		Constructs an object with a balance.
		@param balance the initial balance
	*/
	public BankAccount(int balance)
	{
		this.balance = balance;
	}

	/**
		Returns the total balance in an account.
		@return the balance of the account
	*/
	public double getMeasure()
	{
		return balance;
	}
}