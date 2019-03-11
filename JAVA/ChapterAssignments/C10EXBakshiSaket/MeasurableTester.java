/** Saket Bakshi. 4/4/19. Period 6. This is used for question 1 of Chapter 10.
	Creates a MeasurableTester class that tests the Measurable interface.
*/
public class MeasurableTester
{
	public static void main(String[] args) {
		Measurable[] accounts = new Measurable[3];
		accounts[0] = new BankAccount(0);
		accounts[1] = new BankAccount(1000);
		accounts[2] = new BankAccount(200);

		double averageBalance = Data.average(accounts);
		System.out.println("Average balance: " + averageBalance);
		System.out.println("Expected: 400");

		Measurable maximum = Data.max(accounts);
		System.out.println("The account with the maximum money has $" + maximum.getMeasure());
		System.out.println("Expected: 1000");
	}
}