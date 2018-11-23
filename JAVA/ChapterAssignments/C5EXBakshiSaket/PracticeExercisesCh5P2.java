/* Saket Bakshi. 10/25/18. Period 6
This project, for #2 of Ch 5, takes computes taxes for a specific schedule.
*/
import java.util.Scanner;

public class PracticeExercisesCh5P2
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("I am here to calculate your taxable income!");
		System.out.print("What is your marriage status? "); //asks for marriage status
		String status = key.next();

		if(!status.equals("married") && !status.equals("single")) //if neither married nor single are the reply, the program prompts for marriage status again
		{
			do
			{
				System.out.println("Sorry, I didn't understand your reply. (Please reply with \"married\" or \"single\")");
				status = key.next();	
			} while(!status.equals("married") && !status.equals("single"));
		}

		System.out.print("\nHow much is your taxable income? ");
		int income, tax;
		income = key.nextInt();

		//decides tax bracket based on married or not
		if(status.equals("married"))
		{
			if(income >= 0 && income < 16000)
			{
				tax = (int)(0.1*income);
				System.out.println("Your taxable income is 10% of your income. This means you will be taxed $" + tax + ".");
			}
			else if(income >= 16000 && income <= 64000)
			{
				int tempIncome = income - 16000;
				tax =(int)(1600 + (0.15*tempIncome));
				System.out.println("Your taxable income is $1600 plus 15% of your income over $16000. This means you will be taxed $" + tax + ".");
			}
			else if(income >= 64000)
			{
				int tempIncome = income - 64000;
				tax =(int)(8800 + (0.25*tempIncome));
				System.out.println("Your taxable income is $8800 plus 25% of your income over $64000. This means you will be taxed $" + tax + ".");
			}
		}
		else if(status.equals("single"))
		{
			if(income >= 0 && income < 8000)
			{
				tax =(int)(0.1*income);
				System.out.println("Your taxable income is 10% of your income. This means you will be taxed $" + tax + ".");
			}
			else if(income >= 8000 && income <= 32000)
			{
				int tempIncome = income - 8000;
				tax =(int)(800 + (0.15*tempIncome));
				System.out.println("Your taxable income is $800 plus 15% of your income over $8000. This means you will be taxed $" + tax + ".");
			}
			else if(income >= 32000)
			{
				int tempIncome = income - 32000;
				tax =(int)(4400 + (0.25*tempIncome));
				System.out.println("Your taxable income is $4400 plus 25% of your income over $32000. This means you will be taxed $" + tax + ".");
			}

			//prints out taxable income and how it is calculated
		}
	}
}