/*
Saket Bakshi
Period 6
10/11/18
This program tests a SavingsAccount class.
*/
public class PracticeExercisesCh3E5Tester
{
	public static void main(String[] args)
	{	
		PracticeExercisesCh3E5 saket = new PracticeExercisesCh3E5(1000,10); //makes account with 1000 balance and 10% interest

		saket.addInterest(); //adds interest
		System.out.println(saket.getBalance()); //returns balance
		System.out.println("Expected value: 1100"); //expected balance
	}
}	