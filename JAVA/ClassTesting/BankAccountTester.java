// september 24 2018
public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount saketBalance = new BankAccount(6000);

		System.out.println(saketBalance.getBalance());

		saketBalance.deposit(350.67);

		System.out.println(saketBalance.getBalance());

		saketBalance.withdraw(297.23);

		System.out.println(saketBalance.getBalance());

		BankAccount testerBalance = new BankAccount();

		System.out.println(testerBalance.getBalance());

		BankAccount completeBalance = new BankAccount("Saket", "Bakshi", 6000);

		System.out.println(completeBalance.getFirstName());

		System.out.println(completeBalance.getBalance());

		System.out.println(completeBalance.getLastName());

		System.out.println(completeBalance.getName());

		completeBalance.deposit(600);

		System.out.println(completeBalance.getBalance());

		System.out.println(completeBalance.interestFee(0.01, 6));
	}
}