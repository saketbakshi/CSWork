/*
Saket Bakshi
Period 6
10/11/18
This program makes a SavingsAccount class.
*/
public class PracticeExercisesCh3E5
{

	//instance variables
	private double balance;
	private double interest;

	/** Makes a SavingsAccount variable with a balance of 0 and interest of 0.
	*/
	public PracticeExercisesCh3E5()
	{
		this.balance = 0;
		this.interest = 0;
	}

	/** Makes a SavingsAccount variable with a balance and interest rate, in percent.
	Has methods to add interest to the balance.
	@param balance the initial balance of the account
	@param interestRate the interest rate for the account

	*/
	public PracticeExercisesCh3E5(double balance, double interestRate)
	{
		this.balance = balance;

		double interesting = interestRate / 100 * balance;
		this.interest = interesting;
	}

	/** Adds interest to the balance
	*/
	public void addInterest()
	{
		this.balance = this.balance + this.interest;
	}

	/** returns the balance
	@return the balance of the account
	*/
	public double getBalance()
	{
		return this.balance;
	}
}