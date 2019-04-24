/**
	Saket Bakshi. 4/23/19. Period 6. This is used for problem 2 of Chapter 14.
	Modifies selection sort to sort coins by their value.
*/
public class SelectionSortCoins
{
	/**
		Sorts an array, using selection sort.
		@param a the array to sort
	*/
	public static void sort(Coin[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			int minPos = minimumPosition(a, i);
			ArrayUtilCoin.swap(a, minPos, i);
		}
	}

	/**
		Finds the smallest value of a coin in a tail range of the array.
		@param a the array to sort
		@param from the first position in a to compare
		@return the position of the smallest coin value in the given range
	*/
	private static int minimumPosition(Coin[] a, int from)
	{
		int minPos = from;
		for(int i = from + 1; i < a.length; i++)
		{
			if(a[i].getValue() < a[minPos].getValue()) {minPos = i;}
		}
		return minPos;
	}
}