/* Saket Bakshi 2/3/19. Period 6
This program, for #3 of Ch 8, tests a cash register class.
*/
public class PracticeExercisesCh8E3Tester
{
	public static void main(String[] args)
	{
		final double DOLLAR_VALUE = 1.0;
		final double QUARTER_VALUE = 0.25;
		final double DIME_VALUE = 0.1;
		final double NICKEL_VALUE = 0.05;
		
		PracticeExercisesCh8E3 test = new PracticeExercisesCh8E3();
		
		test.recordPurchase(5.03);
		
		test.enterPayment(4, new PracticeExercisesCh8E3Coin(DOLLAR_VALUE, "dollar bill"));
		test.enterPayment(5, new PracticeExercisesCh8E3Coin(QUARTER_VALUE, "quarter"));

		double myChange = test.giveChange();
		System.out.println("Change: " + myChange);
		System.out.println("Expected: 0.22");
	}
}