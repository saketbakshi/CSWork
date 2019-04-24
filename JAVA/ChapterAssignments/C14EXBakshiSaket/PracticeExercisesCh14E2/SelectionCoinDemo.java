/**
	Saket Bakshi. 4/23/19. Period 6. This is used for problem 2 of Chapter 14.
	Tests a selection sort of coins.
*/
import java.util.Arrays;
public class SelectionCoinDemo
{
	public static void main(String[] args)
	{
		Coin penny = new Coin(0.01, "penny");
		Coin nickel = new Coin(0.05, "nickel");
		Coin dime = new Coin(0.1, "dime");
		Coin quarter = new Coin(0.25, "quarter");

		Coin[] a = {penny, quarter, quarter, penny, dime, nickel, penny, penny, quarter, dime};
		
		System.out.print("Coin values: ");
		for(int i = 0; i < a.length - 1; i++)
		{
			System.out.print(a[i].getName() + ", ");
		}
		System.out.print(a[a.length-1].getName());

		SelectionSortCoins.sort(a);

		System.out.println();
		
		System.out.print("Coin values: ");
		for(int i = 0; i < a.length - 1; i++)
		{
			System.out.print(a[i].getName() + ", ");
		}
		System.out.print(a[a.length-1].getName());
	}
}