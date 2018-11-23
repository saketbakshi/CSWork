public class BankAccount
{
	private double balance;
	private String name;
	private String firstName;
	private String lastName;
	private double interestValue;
	private double bam;
	private double modifier;


	public BankAccount()
	{
		this.balance = 0;
	}

	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
	}

	/** Deposits money into the bank account
		@param amount the amount to deposit to the balance
	*/
	public void deposit(double amount)
	{
		this.balance = balance + amount;
	}

	/** Withdraws money from the bank account
		@param amount the amount to withdraw from the balance
	*/
	public void withdraw(double amount)
	{
		this.balance = balance - amount;
	}

	/** Returns the value of the balance
		@return the current balance
	*/
	public double getBalance()
	{
		return balance;
	}

	/** Defines a BankAccount class variable with has a first name, last name, and 
	balance. Has methods for getting the first name, last name, whole name, calculating 
	interest fee, depositing money, withdrawing money, and getting the balance.
		@param firstName first name of the bank account's owner
		@param lastName last name of the bank account's owner
		@param initialBalance inital balance of the bank account
	*/
	public BankAccount(String firstName, String lastName, double initialBalance)
	{
		this.balance = initialBalance;
		this.name = firstName + " " + lastName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/** Returns the first name
		@return the first name
	*/
	public String getFirstName()
	{
		return firstName;
	}

	/** Returns the last name
		@return the last name
	*/
	public String getLastName()
	{
		return lastName;
	}

	/** Returns the name
		@return the name
	*/
	public String getName()
	{
		return name;
	}

	/** Calculates the intereset fee for a balance with a request for interest rate
	and years of interest
		@param interestRate interest rate, in decimal, of the account
		@param years years to calculate interest for
		@return returns the interest value
	*/
	public double interestFee(double interestRate, double years)
	{
		this.bam = interestRate/4;
		this.modifier = Math.pow(bam, years);
		this.interestValue = balance*modifier;
		return interestValue;
	}
}