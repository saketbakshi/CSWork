import java.util.Scanner;

public class CBT030BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);

		String coin, again;
		int flip, streak = 0;

		do
		{
			flip = 1 + (int)(Math.random()*2);

			if(flip == 1)
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println("You flip a coin and it is... " + coin);

			if(flip == 1)
			{
				streak++;
				System.out.println("\tThat's " + streak + " in a row....");
				System.out.print("\tWould you like to flip again (y/n)? ");
				again = in.next();
			}
			else
			{
				streak = 0;
				again = "n";
			} 
		} while(again.equals("y"));

		System.out.println("Final score: " + streak);
	}
}